/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Account;
import Model.Comment;
import Model.Post;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;

/**
 *
 * @author levan
 */
public class PostDBContext extends DBContext {

    public void AddPost(Post p) {
        try {
            String sql = "INSERT INTO [dbo].[Post]\n"
                    + "           ([time_create]\n"
                    + "           ,[content]\n"
                    + "           ,[url_img]\n"
                    + "           ,[user_id]\n"
                    + "           ,[status])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setTimestamp(1, p.getTime_create());
            stm.setString(2, p.getContent());
            stm.setString(3, p.getUrl_img());
            stm.setInt(4, p.getUser_id());
            stm.setInt(5, p.getStatus());
            System.out.println("da chay 48");
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updatePost(Post p) {
        try {
            String sql = "UPDATE [dbo].[Post]\n"
                    + "   SET [time_create] = ?\n"
                    + "      ,[content] = ?\n"
                    + "      ,[url_img] = ?\n"
                    + "      ,[user_id] = ?\n"
                    + "      ,[status] = ?\n"
                    + " WHERE post_id = ?";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setTimestamp(1, p.getTime_create());
            stm.setString(2, p.getContent());
            stm.setString(3, p.getUrl_img());
            stm.setInt(4, p.getUser_id());
            stm.setInt(5, p.getStatus());
            stm.setInt(6, p.getPost_id());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(p.getTime_create());
    }

    public ArrayList<Post> getPost(int id, int id1, int amount, int op) {
        ArrayList<Post> list = new ArrayList<Post>();
        String sql1 = "select DISTINCT p.post_id, p.time_create, p.content,p.url_img,\n"
                + "                   p.status, a.id as user_id from Post as p \n"
                + "                   inner join Account as a\n"
                + "                    on p.user_id = a.id \n"
                + "                   left join Relationship_User as ru \n"
                + "                   on a.id = ru.user_id\n"
                + "                  where (p.status = 2 and  p.user_id = ?) or (p.status = 1 and ru.user_id = ? and ru.friend_id = ?  and ru.status = 1)\n"
                + "                ORDER BY time_create DESC\n";

        String sql2 = "SELECT * FROM Post\n"
                + "where user_id = ? \n"
                + "ORDER BY time_create DESC\n";
        try {
            String sql = "";
            if (op == 1) {
                sql = sql1;
            } else {
                sql = sql2;
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            if (op == 1) {
                stm.setInt(1, id);
                stm.setInt(2, id);
                stm.setInt(3, id1);
            } else {
                stm.setInt(1, id);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPost_id(rs.getInt("post_id"));
                p.setTime_create(rs.getTimestamp("time_create"));
                p.setContent(rs.getString("content"));
                p.setUrl_img(rs.getString("url_img"));
                p.setUser_id(rs.getInt("user_id"));
                p.setStatus(rs.getInt("status"));

                String sql3 = "SELECT COUNT(like_id) as total\n"
                        + "  FROM [Assignment].[dbo].[Like]\n"
                        + "  where user_id = ? and post_id = ? ";
                PreparedStatement stm_like = connection.prepareStatement(sql3);
                stm_like.setInt(1, id1);
                stm_like.setInt(2, p.getPost_id());

                ResultSet rs_like = stm_like.executeQuery();
                if (rs_like.next()) {
                    if (rs_like.getInt("total") != 0) {
                        p.setUserlike(1);
                    }
                }

                String sql4 = "SELECT COUNT(like_id) as total\n"
                        + "  FROM [Like]\n"
                        + "  WHERE post_id = ?";
                PreparedStatement stm_total = connection.prepareStatement(sql4);
                stm_total.setInt(1, p.getPost_id());
                ResultSet rs_total = stm_total.executeQuery();
                if (rs_total.next()) {
                    p.setCountlike(rs_total.getInt("total"));
                }

                String sql5 = "SELECT top 2 *\n"
                        + "  FROM [dbo].[Comment] as c\n"
                        + "  inner join Account as a\n"
                        + "  on c.user_id = a.id\n"
                        + "  where post_id = ?\n"
                        + "  order by comment_id desc";
                PreparedStatement stm_com = connection.prepareStatement(sql5);
                stm_com.setInt(1, p.getPost_id());
                ResultSet rs_com = stm_com.executeQuery();
                while (rs_com.next()) {
//                    System.out.println("da chay den day 142");
                    Comment c = new Comment();
                    c.setId(rs_com.getInt(1));
                    c.setTime(rs_com.getTimestamp(2));
                    c.setContent(rs_com.getString(3));
                    Account ac = new Account();
                    ac.setId(rs_com.getInt(6));
                    ac.setDisplayname(rs_com.getString(10));
                    ac.setUrl_avata(rs_com.getString(11));
                    c.setAccount(ac);

                    p.getComment().add(c);
                }
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public ArrayList<Post> getPostHome(int id, int amount) {
        ArrayList<Post> list = new ArrayList<>();
        try {
            String sql = "select DISTINCT p.post_id, p.time_create, p.content,p.url_img,\n"
                    + " p.status, a.id, a.displayname, a.url_avarta from Post as p \n"
                    + "inner join Account as a\n"
                    + "on p.user_id = a.id \n"
                    + "left join Relationship_User as ru \n"
                    + "on a.id = ru.user_id\n"
                    + "where p.status = 2 or (p.status = 1 and ru.friend_id = ?  and ru.status = 1) or p.user_id = ?\n"
                    + "ORDER BY p.time_create DESC\n"
                    + "OFFSET ? ROWS\n"
                    + "FETCH NEXT 3 ROWS ONLY";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.setInt(2, id);
            stm.setInt(3, amount);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPost_id(rs.getInt("post_id"));
                p.setTime_create(rs.getTimestamp("time_create"));
                p.setContent(rs.getString("content"));
                p.setUrl_img(rs.getString("url_img"));
                p.setStatus(rs.getInt("status"));
                Account ac = new Account();
                ac.setId(rs.getInt("id"));
                ac.setDisplayname(rs.getString("displayname"));
                ac.setUrl_avata(rs.getString("url_avarta"));
                p.setAc(ac);
                String sql3 = "SELECT COUNT(like_id) as total\n"
                        + "  FROM [Assignment].[dbo].[Like]\n"
                        + "  where user_id = ? and post_id = ? ";
                PreparedStatement stm_like = connection.prepareStatement(sql3);
                stm_like.setInt(1, id);
                stm_like.setInt(2, p.getPost_id());

                ResultSet rs_like = stm_like.executeQuery();
                if (rs_like.next()) {
                    if (rs_like.getInt("total") != 0) {
                        p.setUserlike(1);
                    }
                }

                String sql4 = "SELECT COUNT(like_id) as total\n"
                        + "  FROM [Like]\n"
                        + "  WHERE post_id = ?";
                PreparedStatement stm_total = connection.prepareStatement(sql4);
                stm_total.setInt(1, p.getPost_id());
                ResultSet rs_total = stm_total.executeQuery();
                if (rs_total.next()) {
                    p.setCountlike(rs_total.getInt("total"));
                }

                String sql5 = "SELECT top 2 *\n"
                        + "  FROM [dbo].[Comment] as c\n"
                        + "  inner join Account as a\n"
                        + "  on c.user_id = a.id\n"
                        + "  where post_id = ?\n"
                        + "  order by comment_id desc";
                PreparedStatement stm_com = connection.prepareStatement(sql5);
                stm_com.setInt(1, p.getPost_id());
                ResultSet rs_com = stm_com.executeQuery();
                while (rs_com.next()) {
//                    System.out.println("da chay den day 142");
                    Comment c = new Comment();
                    c.setId(rs_com.getInt(1));
                    c.setTime(rs_com.getTimestamp(2));
                    c.setContent(rs_com.getString(3));
                    Account a = new Account();
                    a.setId(rs_com.getInt(6));
                    a.setDisplayname(rs_com.getString(10));
                    a.setUrl_avata(rs_com.getString(11));
                    c.setAccount(a);

                    p.getComment().add(c);
                }
                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList<Post> getImg(int id, int id1, int amount, int op) {
        ArrayList<Post> list = new ArrayList<Post>();
        String sql1 = "select DISTINCT p.url_img,p.time_create\n"
                + "                  from Post as p \n"
                + "                   inner join Account as a\n"
                + "                    on p.user_id = a.id \n"
                + "                   left join Relationship_User as ru \n"
                + "                   on a.id = ru.user_id\n"
                + "                  where (p.status = 2 and  p.user_id = ?) or (p.status = 1 and ru.user_id = ? and ru.friend_id = ?  and ru.status = 1)\n"
                + "                ORDER BY time_create DESC\n";

        String sql2 = "SELECT * FROM Post\n"
                + "where user_id = ? \n"
                + "ORDER BY time_create DESC\n";
        try {
            String sql = "";
            if (op == 1) {
                sql = sql1;
            } else {
                sql = sql2;
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            if (op == 1) {
                stm.setInt(1, id);
                stm.setInt(2, id);
                stm.setInt(3, id1);
            } else {
                stm.setInt(1, id);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setUrl_img(rs.getString("url_img"));
                list.add(p);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public ArrayList<Account> getFriend(int id, int amount) {
        ArrayList<Account> list = new ArrayList<>();
        try {
            String sql = "select * from Relationship_User as ru \n"
                    + "inner join Account as a\n"
                    + "on ru.friend_id = a.id\n"
                    + "where ru.user_id = ? and ru.status != 0 and ru.status != 2\n"
                    + "ORDER BY ru.user_id DESC\n";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account ac = new Account();
                ac.setId(rs.getInt(4));
                ac.setDisplayname(rs.getString(8));
                ac.setUrl_avata(rs.getString(9));
                list.add(ac);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void deletePost(int id) {
        ArrayList<Account> list = new ArrayList<>();
        try {
            String sql_comment = "DELETE FROM [dbo].[Comment]\n"
                    + "      WHERE post_id = ?";
            String sql_like = "DELETE FROM [dbo].[Like]\n"
                    + "      WHERE post_id = ?";
            String sql_post = "DELETE FROM [dbo].[Post]\n"
                    + "      WHERE post_id = ? ";
            PreparedStatement stm_comment = connection.prepareStatement(sql_comment);
            stm_comment.setInt(1, id);
            stm_comment.executeUpdate();

            PreparedStatement stm_like = connection.prepareStatement(sql_like);
            stm_like.setInt(1, id);
            stm_like.executeUpdate();

            PreparedStatement stm_post = connection.prepareStatement(sql_post);
            stm_post.setInt(1, id);
            stm_post.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Post getPost(int id) {
        try {
            String sql = "SELECT [post_id]\n"
                    + "      ,[time_create]\n"
                    + "      ,[content]\n"
                    + "      ,[url_img]\n"
                    + "      ,[user_id]\n"
                    + "      ,[status]\n"
                    + "  FROM [Assignment].[dbo].[Post]\n"
                    + "  where post_id = ? ";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPost_id(id);
                p.setTime_create(rs.getTimestamp("time_create"));
                p.setContent(rs.getString("content"));
                p.setUrl_img(rs.getString("url_img"));
                p.setUser_id(rs.getInt("user_id"));
                p.setStatus(rs.getInt("status"));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
