/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Profile;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author levan
 */
public class ProfileDBContext extends DBContext {

    public Profile getProfile(int id) {
        try {
            String sql = " select * from Profile where user_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Profile p = new Profile();
                p.setUrl_avata(rs.getString("url_avata"));
                p.setWed(rs.getString(2));
                p.setGithub(rs.getString(3));
                p.setTwitter(rs.getString(4));
                p.setInsta(rs.getString(5));
                p.setFace(rs.getString(6));
                p.setFname(rs.getString(7));
                p.setGender(rs.getInt(8));
                p.setDob(rs.getDate(9));
                p.setMstatus(rs.getString(10));
                p.setLocation(rs.getString(11));
                p.setNumber(rs.getString(12));
                p.setOccupation(rs.getString(13));
                p.setSkill(rs.getString(14));
                return p;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfileDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void updateProfile(Profile p, int id) {
        try {
            String sql = "UPDATE [dbo].[Profile]\n"
                    + "   SET [Website] = ?\n"
                    + "      ,[Github] = ?\n"
                    + "      ,[Twitter] = ?\n"
                    + "      ,[Instagram] = ?\n"
                    + "      ,[Facebook] = ?\n"
                    + "      ,[Full_name] = ?\n"
                    + "      ,[Gender] = ?\n"
                    + "      ,[Birth_Date] = ?\n"
                    + "      ,[Martail_Status] = ?\n"
                    + "      ,[Location] = ?\n"
                    + "      ,[Mobile_Number] = ?\n"
                    + "      ,[Occupation] = ?\n"
                    + "      ,[Skills] = ?\n"
                    + " WHERE user_id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, p.getWed());
            stm.setString(2, p.getGithub());
            stm.setString(3, p.getTwitter());
            stm.setString(4, p.getInsta());
            stm.setString(5, p.getFace());
            stm.setString(6, p.getFname());
            stm.setInt(7, p.getGender());
            stm.setDate(8, (Date) p.getDob());
            stm.setString(9, p.getMstatus());
            stm.setString(10, p.getLocation());
            stm.setString(11, p.getNumber());
            stm.setString(12, p.getOccupation());
            stm.setString(13, p.getSkill());
            stm.setInt(14, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProfileDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertProfile(Profile p, int id) {
        try {
            String sql = "INSERT INTO [dbo].[Profile]\n"
                    + "           ([user_id]\n"
                    + "           ,[Website]\n"
                    + "           ,[Github]\n"
                    + "           ,[Twitter]\n"
                    + "           ,[Instagram]\n"
                    + "           ,[Facebook]\n"
                    + "           ,[Full_name]\n"
                    + "           ,[Gender]\n"
                    + "           ,[Birth_Date]\n"
                    + "           ,[Martail_Status]\n"
                    + "           ,[Location]\n"
                    + "           ,[Mobile_Number]\n"
                    + "           ,[Occupation]\n"
                    + "           ,[Skills]\n"
                    + "           )\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           )";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.setString(2, p.getWed());
            stm.setString(3, p.getGithub());
            stm.setString(4, p.getTwitter());
            stm.setString(5, p.getInsta());
            stm.setString(6, p.getFace());
            stm.setString(7, p.getFname());
            stm.setInt(8, p.getGender());
            stm.setDate(9, p.getDob());
            stm.setString(10, p.getMstatus());
            stm.setString(11, p.getLocation());
            stm.setString(12, p.getNumber());
            stm.setString(13, p.getOccupation());
            stm.setString(14, p.getSkill());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProfileDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
