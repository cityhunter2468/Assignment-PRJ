/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

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

    public ArrayList<Post> getPost(int id, int amount, int op) {
        ArrayList<Post> list = new ArrayList<Post>();
        String sql1 = "SELECT * FROM Post\n"
                + "where user_id = ? and status != 0\n"
                + "ORDER BY time_create DESC\n"
                + "OFFSET ? ROWS\n"
                + "FETCH NEXT 9 ROWS ONLY";

        String sql2 = "SELECT * FROM Post\n"
                + "where user_id = ? \n"
                + "ORDER BY time_create DESC\n"
                + "OFFSET ? ROWS\n"
                + "FETCH NEXT 9 ROWS ONLY";
        try {
            String sql = "";
            if (op == 1) {
                sql = sql1;
            } else {
                sql = sql2;
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.setInt(2, amount);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                System.out.println("3");
                Post p = new Post();
                p.setPost_id(rs.getInt("post_id"));
                Timestamp time = rs.getTimestamp("time_create");
                System.out.println(time);
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
}
