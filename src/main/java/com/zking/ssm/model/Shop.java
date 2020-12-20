package com.zking.ssm.model;

import lombok.Data;

@Data
public class Shop {
    private Integer id;

    private Integer userid;

    private String shopname;

    private String shopinfo;

    private String shopimg;

    private String shopaddress;

    private String shopstatus;

    public Shop(Integer id, Integer userid, String shopname, String shopinfo, String shopimg, String shopaddress, String shopstatus) {
        this.id = id;
        this.userid = userid;
        this.shopname = shopname;
        this.shopinfo = shopinfo;
        this.shopimg = shopimg;
        this.shopaddress = shopaddress;
        this.shopstatus = shopstatus;
    }

    public Shop() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopinfo() {
        return shopinfo;
    }

    public void setShopinfo(String shopinfo) {
        this.shopinfo = shopinfo;
    }

    public String getShopimg() {
        return shopimg;
    }

    public void setShopimg(String shopimg) {
        this.shopimg = shopimg;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }

    public String getShopstatus() {
        return shopstatus;
    }

    public void setShopstatus(String shopstatus) {
        this.shopstatus = shopstatus;
    }
}