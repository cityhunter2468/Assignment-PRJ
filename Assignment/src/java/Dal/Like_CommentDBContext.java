/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
}
