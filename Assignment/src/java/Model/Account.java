/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author levan
 */
public class Account {
    private int id;
    private String user;
    private String pass; 
    private String email;
    private String displayname;

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account(int id, String user, String pass, String email, String displayname) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.email = email;
        this.displayname = displayname;
    }

    public Account() {
    } 
    
}
