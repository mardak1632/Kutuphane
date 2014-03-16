package com.bilisimegitim.course.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

public class Kullanici {
    private Integer kullaniciId;
    private String kullaniciAd;
    private String kullaniciSoyad;
    private String cinsiyet;
    private Date dogumTarihi;
    private String email;
    private String sifre;
    
    public Kullanici(){
        
    }

    public Integer getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Integer kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }

    public String getKullaniciSoyad() {
        return kullaniciSoyad;
    }

    public void setKullaniciSoyad(String kullaniciSoyad) {
        this.kullaniciSoyad = kullaniciSoyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
            
}
