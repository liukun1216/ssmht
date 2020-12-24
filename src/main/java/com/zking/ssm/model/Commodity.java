package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class Commodity {
    private Integer id;

    private String name;

    private Integer typeId;

    private Integer shopId;

    private Integer price;

    private Integer stock;

    private String image;

    private String introduction;

    private Integer salesVolume;

    private Date createTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    private String status;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date addedTime;

    private String detailedIntroduction;

    public Commodity(Integer id, String name, Integer typeId, Integer shopId, Integer price, Integer stock, String image, String introduction, Integer salesVolume, Date createTime, Date updateTime, String status, Date addedTime, String detailedIntroduction) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.shopId = shopId;
        this.price = price;
        this.stock = stock;
        this.image = image;
        this.introduction = introduction;
        this.salesVolume = salesVolume;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
        this.addedTime = addedTime;
        this.detailedIntroduction = detailedIntroduction;
    }

    public Commodity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getshopId() {
        return shopId;
    }

    public void setshopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Integer getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(Integer salesVolume) {
        this.salesVolume = salesVolume;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Date addedTime) {
        this.addedTime = addedTime;
    }

    public String getDetailedIntroduction() {
        return detailedIntroduction;
    }

    public void setDetailedIntroduction(String detailedIntroduction) {
        this.detailedIntroduction = detailedIntroduction;
    }
}