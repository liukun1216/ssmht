package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class CommodityOrder {
    private Integer id;

    private Integer userId;

    private String status;

    private Integer commodityQuantity;

    private Float totalAmount;

    private String waybillNumber;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    public CommodityOrder(Integer id, Integer userId, String status, Integer commodityQuantity, Float totalAmount, String waybillNumber, Date createTime, Date updateTime) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
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