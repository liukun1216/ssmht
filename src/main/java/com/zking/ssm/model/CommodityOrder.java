package com.zking.ssm.model;

import lombok.Data;

import java.util.Date;

@Data
public class CommodityOrder {
    private String id;

    private Integer userId;

    private Integer shopId;

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    private String status;

    private Integer commodityQuantity;

    private Integer totalAmount;

    private String waybillNumber;

    private Date createTime;

    private Date updateTime;

    public CommodityOrder(String id, Integer userId, String status, Integer commodityQuantity, Integer totalAmount, String waybillNumber, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.status = status;
        this.commodityQuantity = commodityQuantity;
        this.totalAmount = totalAmount;
        this.waybillNumber = waybillNumber;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public CommodityOrder() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCommodityQuantity() {
        return commodityQuantity;
    }

    public void setCommodityQuantity(Integer commodityQuantity) {
        this.commodityQuantity = commodityQuantity;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}