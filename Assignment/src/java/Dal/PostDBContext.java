/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Post;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author levan
 */
public class PostDBContext extends DBContext {

    public void AddPost(Post p) {
        try {
            String sql = "INSERT INTO [dbo].[Post]\n"
                    + "           ([content]\n"
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
                    + "           ,?)";
            
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, p.getContent());
            stm.setString(2, p.getUrl_img());
            stm.setString(3, p.getUrl_video());
            stm.setInt(4, p.getUser_id());
            stm.setInt(5, p.getStatus());
            stm.setString(6, p.getUrl_file());
            ResultSet rs = stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(PostDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
