package com.zking.ssm.model;

import lombok.Data;

@Data
public class ShippingAddress {
    private Integer id;

    private Integer userid;

    private String address;

    private String addressname;

    private String location;

    private String phone;

    private String status;

    public ShippingAddress(Integer id, Integer userid, String address, String addressname, String location, String phone, String status) {
        this.id = id;
        this.userid = userid;
        this.address = address;
        this.addressname = addressname;
        this.location = location;
        this.phone = phone;
        this.status = status;
    }

    public ShippingAddress() {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressname() {
        return addressname;
    }

    public void setAddressname(String addressname) {
        this.addressname = addressname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}