package com.zking.ssm.model;

import lombok.Data;

@Data
public class CommodityCategory {
    private Integer id;

    private String name;

    public CommodityCategory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public CommodityCategory() {
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
}