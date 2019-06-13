package com.example.recyclerview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {
    public Product() {
    }

    public Product(String id, String tensp, String giasp, String hinhanhsp, String motasp, String idsanpham) {
        this.id = id;
        this.tensp = tensp;
        this.giasp = giasp;
        this.hinhanhsp = hinhanhsp;
        this.motasp = motasp;
        this.idsanpham = idsanpham;
    }

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("tensp")
    @Expose
    private String tensp;
    @SerializedName("giasp")
    @Expose
    private String giasp;
    @SerializedName("hinhanhsp")
    @Expose
    private String hinhanhsp;
    @SerializedName("motasp")
    @Expose
    private String motasp;
    @SerializedName("idsanpham")
    @Expose
    private String idsanpham;

    public String getId() {
    return id;
    }

    public void setId(String id) {
    this.id = id;
    }

    public String getTensp() {
    return tensp;
    }

    public void setTensp(String tensp) {
    this.tensp = tensp;
    }

    public String getGiasp() {
    return giasp;
    }

    public void setGiasp(String giasp) {
    this.giasp = giasp;
    }

    public String getHinhanhsp() {
    return hinhanhsp;
    }

    public void setHinhanhsp(String hinhanhsp) {
    this.hinhanhsp = hinhanhsp;
    }

    public String getMotasp() {
    return motasp;
    }

    public void setMotasp(String motasp) {
    this.motasp = motasp;
    }

    public String getIdsanpham() {
    return idsanpham;
    }

    public void setIdsanpham(String idsanpham) {
    this.idsanpham = idsanpham;
    }

}