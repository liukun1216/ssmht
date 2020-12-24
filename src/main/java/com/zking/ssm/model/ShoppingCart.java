package com.zking.ssm.model;

public class ShoppingCart {
    private Integer id;

    private Integer userid;

    private Integer commodityid;

    private Integer amount;

    private Integer price;

    public ShoppingCart(Integer id, Integer userid, Integer commodityid, Integer amount, Integer price) {
        this.id = id;
        this.userid = userid;
        this.commodityid = commodityid;
        this.amount = amount;
        this.price = price;
    }

    public ShoppingCart() {
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

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}