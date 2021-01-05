package com.example.tugasrecyclerview;

public class PolaItem {
    private int img;
    private String judul;
    private String deskripsi;

    public PolaItem(int img, String judul, String deskripsi) {
        this.img = img;
        this.judul = judul;
        this.deskripsi = deskripsi;
    }

    public int getImg() {
        return img;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }
}
