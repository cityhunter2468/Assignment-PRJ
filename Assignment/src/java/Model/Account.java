/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

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
    private String url_avata;
    private ArrayList<Account> friend = new ArrayList<Account>();
            
    public String getUrl_avata() {
        return url_avata;
    }

    public void setUrl_avata(String url_avata) {
        this.url_avata = url_avata;
    }
    
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

    public ArrayList<Account> getFriend() {
        return friend;
    }

    public void setFriend(ArrayList<Account> friend) {
        this.friend = friend;
    }

    public Account(int id, String user, String pass, String email, String displayname, String url_avata) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.email = email;
        this.displayname = displayname;
        this.url_avata = url_avata;
    }

    
    public Account() {
    } 
    
}
