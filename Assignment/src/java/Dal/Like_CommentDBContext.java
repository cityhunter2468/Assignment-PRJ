/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Account;
import Model.Comment;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author levan
 */
public class Like_CommentDBContext extends DBContext {

    public void insertLike(int id_user, int id_post) {

        try {
            String sql = "INSERT INTO [dbo].[Like]\n"
                    + "           ([user_id]\n"
                    + "           ,[post_id])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?)";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id_user);
            stm.setInt(2, id_post);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Like_CommentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteLike(int id_user, int id_post) {

        try {
            String sql = "DELETE FROM [dbo].[Like]\n"
                    + "      WHERE user_id = ? and post_id = ? ";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id_user);
            stm.setInt(2, id_post);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Like_CommentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertComment(int id_user, int id_post, String content) {

        try {
            String sql = "INSERT INTO [dbo].[Comment]\n"
                    + "           ([time_create]\n"
                    + "           ,[content]\n"
                    + "           ,[user_id]\n"
                    + "           ,[post_id])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";

            PreparedStatement stm = connection.prepareStatement(sql);
            Timestamp added_date = new Timestamp(System.currentTimeMillis());
            stm.setTimestamp(1, added_date);
            stm.setString(2, content);
            stm.setInt(3, id_user);
            stm.setInt(4, id_post);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Like_CommentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Comment> getMoreComment(int id, int amount) {
        ArrayList<Comment> list = new ArrayList<>();
        try {
            String sql = "  select * from Comment as c \n"
                    + "  inner join Account as a\n"
                    + "  on c.user_id = a.id\n"
                    + "  where c.post_id = ? \n"
                    + "  ORDER BY c.comment_id DESC\n"
                    + "  OFFSET ? ROWS\n"
                    + "FETCH NEXT 2 ROWS ONLY";

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.setInt(2, amount);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Comment c = new Comment();
                    c.setId(rs.getInt(1));
                    c.setTime(rs.getTimestamp(2));
                    c.setContent(rs.getString(3));                     
                    Account ac = new Account();
                    ac.setId(rs.getInt(6));
                    ac.setDisplayname(rs.getString(10));                   
                    ac.setUrl_avata(rs.getString(11));                     
                    c.setAccount(ac);
                    list.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Like_CommentDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
