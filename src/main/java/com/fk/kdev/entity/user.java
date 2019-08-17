package com.fk.kdev.entity;


import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class user {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @LastModifiedDate
    private Date lastModified;

    @CreatedDate
    private Date createdAt;

    private String email;

    private String password;

    private long points;

    private double paidAmount;


    public user() {
    }


    public user(long id, Date lastModified, Date createdAt, String email, String password, long points, double paidAmount) {
        this.id = id;
        this.lastModified = lastModified;
        this.createdAt = createdAt;
        this.email = email;
        this.password = password;
        this.points = points;
        this.paidAmount = paidAmount;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPoints() {
        return points;
    }

    public void setPoints(long points) {
        this.points = points;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }
}
