/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dal;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Account;

/**
 *
 * @author levan
 */
public class AccountDBContext extends DBContext {

    public Account getAccount(Account a) {
        try {
            String sql = " select * from Account\n"
                    + "where [username] = ? and [password] = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getUser());
            stm.setString(2, a.getPass());
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Account ac = new Account();
                ac.setId(rs.getInt("id"));
                ac.setUser(rs.getString("username"));
                ac.setPass(rs.getString("password"));
                ac.setDisplayname(rs.getString(5));
                ac.setUrl_avata(rs.getString(6));
                return ac;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String Insert(Account a) {
        try {
            String sql = "INSERT INTO [dbo].[Account]\n"
                    + "           ([username]\n"
                    + "           ,[password]\n"
                    + "           ,[email]\n"
                    + "           ,[displayname])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, a.getUser());
            stm.setString(2, a.getPass());
            stm.setString(3, a.getEmail());
            stm.setString(4, a.getDisplayname());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBContext.class.getName()).log(Level.SEVERE, null, ex);
            return ("not oke");
        }
        return ("oke");
    }
}
