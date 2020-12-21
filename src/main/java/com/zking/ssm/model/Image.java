package com.zking.ssm.model;

import lombok.Data;

@Data
public class Image {
    private Integer id;

    private String iname;

    private String img;

    public Image(Integer id, String iname, String img) {
        this.id = id;
        this.iname = iname;
        this.img = img;
    }

    public Image() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}