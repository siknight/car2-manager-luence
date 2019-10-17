package com.car.bean;

public class CarBean {
    private int id;
    private String name;
    private String price;
    private String color;
    private String describe;
    private String url;
    private String imgUrl;
    private int typeid;
    private int salesNumber;
    private int collectNumber;
    private String carType;

    public CarBean() {
        super();
    }

    public CarBean(int id, String name, String price, String color, String describe, String url, String imgUrl, int typeid, int salesNumber, int collectNumber, String carType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.color = color;
        this.describe = describe;
        this.url = url;
        this.imgUrl = imgUrl;
        this.typeid = typeid;
        this.salesNumber = salesNumber;
        this.collectNumber = collectNumber;
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "CarBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", color='" + color + '\'' +
                ", describe='" + describe + '\'' +
                ", url='" + url + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", typeid=" + typeid +
                ", salesNumber=" + salesNumber +
                ", collectNumber=" + collectNumber +
                ", carType='" + carType + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public int getSalesNumber() {
        return salesNumber;
    }

    public void setSalesNumber(int salesNumber) {
        this.salesNumber = salesNumber;
    }

    public int getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(int collectNumber) {
        this.collectNumber = collectNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
