package com.example.gkthu;

import java.io.Serializable;

public class Kinh implements Serializable {

    private int Id;
    private String Ten;
    private String Gia;
    private String Kieu;
    public Kinh(int id, String ten, String gia, String kieu) {
        Id = id;
        Ten = ten;
        Gia = gia;
        Kieu = kieu;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public String getKieu() {
        return Kieu;
    }

    public void setKieu(String kieu) {
        Kieu = kieu;
    }


}
