package com.zking.ssm.model;

import lombok.Data;

@Data
public class Area {
    private Integer id;

    private Integer pid;

    private String shortname;

    private String name;

    private String mergerName;

    private Byte level;

    private String pinyin;

    private String code;

    private String zipCode;

    private String first;

    private String lng;

    private String lat;

    public Area(Integer id, Integer pid, String shortname, String name, String mergerName, Byte level, String pinyin, String code, String zipCode, String first, String lng, String lat) {
        this.id = id;
        this.pid = pid;
        this.shortname = shortname;
        this.name = name;
        this.mergerName = mergerName;
        this.level = level;
        this.pinyin = pinyin;
        this.code = code;
        this.zipCode = zipCode;
        this.first = first;
        this.lng = lng;
        this.lat = lat;
    }

    public Area() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMergerName() {
        return mergerName;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
}