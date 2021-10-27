/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import Model.Profile;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author levan
 */
public class ProfileDBContext extends DBContext{
    public Profile getProfile(int id) {
        try {
            String sql = " select * from Profile where user_id = 1";
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
}
