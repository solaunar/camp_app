package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
class Reservation{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int resId;

    private String cname;
    private int aquantity;
    private int bquantity;
    private int cquantity;
    private Date rdate;
    private Date ddate;
    private String uname;
    private String ulastname;
    private String uemail;
    private String username;
    private String campId;
    private int userId;

    public Reservation(){}

    public Reservation(int resId, String cname, int aquantity, int bquantity, int cquantity, Date rdate, Date ddate, String uname, String ulastname, String uemail, String username, String campId, int userId) {
        this.resId = resId;
        this.cname = cname;
        this.aquantity = aquantity;
        this.bquantity = bquantity;
        this.cquantity = cquantity;
        this.rdate = rdate;
        this.ddate = ddate;
        this.uname = uname;
        this.ulastname = ulastname;
        this.uemail = uemail;
        this.username = username;
        this.campId = campId;
        this.userId = userId;
    }


    public int getResId() {
        return resId;
    }

    public String getCname() {
        return cname;
    }

    public int getAquantity() {
        return aquantity;
    }

    public int getBquantity() {
        return bquantity;
    }

    public int getCquantity() {
        return cquantity;
    }

    public Date getRdate() {
        return rdate;
    }

    public Date getDdate() {
        return ddate;
    }

    public String getUname() {
        return uname;
    }

    public String getUlastname() {
        return ulastname;
    }

    public String getUemail() {
        return uemail;
    }

    public String getUsername() {
        return username;
    }

    public String getCampId() {
        return campId;
    }

    public int getUserId() {
        return userId;
    }
}