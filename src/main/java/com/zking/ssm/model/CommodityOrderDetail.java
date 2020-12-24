package com.zking.ssm.model;


import lombok.Data;

@Data
public class CommodityOrderDetail {
    private Integer id;

    private String orderId;

    private Integer commodityId;

    private String commodityName;

    private Integer commodityPrice;

    private Integer commodityQuantity;

    public CommodityOrderDetail(Integer id, String orderId, Integer commodityId, String commodityName, Integer commodityPrice, Integer commodityQuantity) {
        this.id = id;
        this.orderId = orderId;
        this.commodityId = commodityId;
        this.commodityName = commodityName;
        this.commodityPrice = commodityPrice;
        this.commodityQuantity = commodityQuantity;
    }

    public CommodityOrderDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getCommodityPrice() {
        return commodityPrice;
    }

    public void setCommodityPrice(Integer commodityPrice) {
        this.commodityPrice = commodityPrice;
    }

    public Integer getCommodityQuantity() {
        return commodityQuantity;
    }

    public void setCommodityQuantity(Integer commodityQuantity) {
        this.commodityQuantity = commodityQuantity;
    }
}