/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Account;
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
                    + "           ,[url_video]\n"
                    + "           ,[user_id]\n"
                    + "           ,[status]\n"
                    + "           ,[url_file])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setTimestamp(1, p.getTime_create());
            stm.setString(2, p.getContent());
            stm.setString(3, p.getUrl_img());
            stm.setString(4, p.getUrl_video());
            stm.setInt(5, p.getUser_id());
            stm.setInt(6, p.getStatus());
            stm.setString(7, p.getUrl_file());
            ResultSet rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Post> getPost(int id, int id1, int amount, int op) {
        ArrayList<Post> list = new ArrayList<Post>();
        String sql1 = "select DISTINCT p.post_id, p.time_create, p.content,p.url_img,\n"
                + "                  p.url_video, p.status, p.url_file, a.id as user_id from Post as p \n"
                + "                   inner join Account as a\n"
                + "                    on p.user_id = a.id \n"
                + "                   left join Relationship_User as ru \n"
                + "                   on a.id = ru.user_id\n"
                + "                  where (p.status = 2 and  p.user_id = ?) or (p.status = 1 and ru.user_id = ? and ru.friend_id = ?  and ru.status = 1)\n"
                + "                ORDER BY time_create DESC\n"
                + "               OFFSET ? ROWS\n"
                + "                FETCH NEXT 5 ROWS ONLY";

        String sql2 = "SELECT * FROM Post\n"
                + "where user_id = ? \n"
                + "ORDER BY time_create DESC\n"
                + "OFFSET ? ROWS\n"
                + "FETCH NEXT 5 ROWS ONLY";
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
                stm.setInt(4, amount);
            } else {
                stm.setInt(1, id);
                stm.setInt(2, amount);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Post p = new Post();
                p.setPost_id(rs.getInt("post_id"));
                p.setTime_create(rs.getTimestamp("time_create"));
                p.setContent(rs.getString("content"));
                p.setUrl_img(rs.getString("url_img"));
                p.setUrl_video(rs.getString("url_video"));
                p.setUser_id(rs.getInt("user_id"));
                p.setStatus(rs.getInt("status"));
                p.setUrl_file(rs.getString("url_file"));
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
                    + "p.url_video, p.status, p.url_file, a.id, a.displayname, a.url_avarta from Post as p \n"
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
                p.setUrl_video(rs.getString("url_video"));
                p.setStatus(rs.getInt("status"));
                p.setUrl_file(rs.getString("url_file"));
                Account ac = new Account();
                ac.setId(rs.getInt("id"));
                ac.setDisplayname(rs.getString("displayname"));
                ac.setUrl_avata(rs.getString("url_avarta"));
                p.setAc(ac);
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
                + "                ORDER BY time_create DESC\n"
                + "               OFFSET ? ROWS\n"
                + "                FETCH NEXT 5 ROWS ONLY";

        String sql2 = "SELECT * FROM Post\n"
                + "where user_id = ? \n"
                + "ORDER BY time_create DESC\n"
                + "OFFSET ? ROWS\n"
                + "FETCH NEXT 5 ROWS ONLY";
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
                stm.setInt(4, amount);
            } else {
                stm.setInt(1, id);
                stm.setInt(2, amount);
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
                    + "where ru.user_id = ? and ru.status != 0\n"
                    + "ORDER BY ru.user_id DESC\n"
                    + "                OFFSET ? ROWS\n"
                    + "                FETCH NEXT 5 ROWS ONLY";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.setInt(2, amount);
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
}
