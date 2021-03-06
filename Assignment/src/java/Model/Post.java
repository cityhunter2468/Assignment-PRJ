/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author levan
 */
public class Post {
    private int post_id;
    private int user_id;
    private String url_img;
    private String url_video;
    private String url_file;
    private Timestamp time_create;
    private int status;
    private String content;
    private ArrayList<Comment> comment = new ArrayList<>();
    private Account ac = new Account();
    private int userlike;
    private int countlike;
    
    public int getUser_id() {
        return user_id;
    }

    public String getUrl_img() {
        return url_img;
    }

    public String getUrl_video() {
        return url_video;
    }

    public String getUrl_file() {
        return url_file;
    }

    public Timestamp getTime_create() {
        return time_create;
    }

    public int getStatus() {
        return status;
    }

    public String getContent() {
        return content;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }

    public void setUrl_video(String url_video) {
        this.url_video = url_video;
    }

    public void setUrl_file(String url_file) {
        this.url_file = url_file;
    }

    public void setTime_create(Timestamp time_create) {
        this.time_create = time_create;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public ArrayList<Comment> getComment() {
        return comment;
    }

    public void setComment(ArrayList<Comment> comment) {
        this.comment = comment;
    }

    public Account getAc() {
        return ac;
    }

    public void setAc(Account ac) {
        this.ac = ac;
    }

    public int getUserlike() {
        return userlike;
    }

    public void setUserlike(int userlike) {
        this.userlike = userlike;
    }

    public int getCountlike() {
        return countlike;
    }

    public void setCountlike(int countlike) {
        this.countlike = countlike;
    }

    public Post(int post_id, int user_id, String url_img, String url_video, String url_file, Timestamp time_create, int status, String content, int userlike, int countlike) {
        this.post_id = post_id;
        this.user_id = user_id;
        this.url_img = url_img;
        this.url_video = url_video;
        this.url_file = url_file;
        this.time_create = time_create;
        this.status = status;
        this.content = content;
        this.userlike = userlike;
        this.countlike = countlike;
    }

    

    

    public Post() {
    }

}
