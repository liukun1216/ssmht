package com.zking.ssm.model;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private Integer id;

    private String account;

    private String username;

    private String password;

    private String realname;

    private String idcard;

    private String phone;

    private String email;

    private String status;

    private String address;

    private Date createTime;

    private Date lastLogin;

    public User(Integer id, String account, String username, String password, String realname, String idcard, String phone, String email, String status, String address, Date createTime, Date lastLogin) {
        this.id = id;
        this.account = account;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.idcard = idcard;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.address = address;
        this.createTime = createTime;
        this.lastLogin = lastLogin;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
}