/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;


/**
 *
 * @author levan
 */
public class Profile {
    private String url_avata;
    private String wed;
    private String github;
    private String twitter;
    private String insta;
    private String face;
    private String fname;
    private int gender;
    private Date dob;
    private String mstatus;
    private String location;
    private String number;
    private String occupation;
    private String skill;

    public String getUrl_avata() {
        return url_avata;
    }

    public void setUrl_avata(String url_avata) {
        this.url_avata = url_avata;
    }

    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInsta() {
        return insta;
    }

    public void setInsta(String insta) {
        this.insta = insta;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMstatus() {
        return mstatus;
    }

    public void setMstatus(String mstatus) {
        this.mstatus = mstatus;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Profile(String url_avata, String wed, String github, String twitter, String insta, String face, String fname, int gender, Date dob, String mstatus, String location, String number, String occupation, String skill) {
        this.url_avata = url_avata;
        this.wed = wed;
        this.github = github;
        this.twitter = twitter;
        this.insta = insta;
        this.face = face;
        this.fname = fname;
        this.gender = gender;
        this.dob = dob;
        this.mstatus = mstatus;
        this.location = location;
        this.number = number;
        this.occupation = occupation;
        this.skill = skill;
    }

    public Profile() {
    }
             
}
