/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bilisimegitim.course.dao;

import com.bilisimegitim.course.entity.Kullanici;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KullaniciDAO {

    public Kullanici getKullanici(String email) throws Exception {
        Connection con = null;
        Kullanici kullanici = null;
        try {
            String sqlStr = "select * from kullanici where email=?";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arda?zeroDateTimeBehavior=convertToNull", "root", "");
            PreparedStatement pstmt = con.prepareStatement(sqlStr);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                kullanici = new Kullanici();
                kullanici.setKullaniciId(rs.getInt("kullanici_id"));
                kullanici.setKullaniciAd(rs.getString("kullanici_ad"));
                kullanici.setKullaniciSoyad(rs.getString("kullanici_soyad"));
                kullanici.setCinsiyet(rs.getString("cinsiyet"));
                kullanici.setEmail(rs.getString("email"));
                kullanici.setDogumTarihi(new Date(rs.getDate("dogum_tarihi").getTime()));
                kullanici.setSifre(rs.getString("sifre"));
            }
        } catch (ClassNotFoundException ex) {
            throw new Exception(ex);
        } catch (SQLException ex) {
            throw new Exception(ex);
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    throw new Exception(ex);
                }
            }
        }
        return kullanici;
    }

    public void createKullanici(Kullanici kullanici) {
        String sqlStr = "insert into kullanici (kullanici_ad,kullanici_soyad,cinsiyet,dogum_tarihi,sifre) values(?,?,?,?,?,?)";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arda?zeroDateTimeBehavior=convertToNull");
            PreparedStatement pstmt = con.prepareStatement(sqlStr);
            pstmt.setString(1, kullanici.getKullaniciAd());
            pstmt.setString(2, kullanici.getKullaniciSoyad());
            pstmt.setString(3, kullanici.getCinsiyet());
            pstmt.setDate(4, new java.sql.Date(kullanici.getDogumTarihi().getTime()));
            pstmt.setString(5, kullanici.getSifre());
            pstmt.setString(6, kullanici.getEmail());

            pstmt.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KullaniciDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateKullanci(Kullanici kullanici) {
        String sqlStr = "UPDATE Kullanici SET Kullanici_ad=?,Kullanici_soyad=? WHERE email=?";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arda?zeroDateTimeBehavior=convertToNull");
            PreparedStatement pstmt = con.prepareStatement(sqlStr);
    
            pstmt.setString(1, kullanici.getKullaniciAd());
            pstmt.setString(2, kullanici.getKullaniciSoyad());
            pstmt.setString(3, kullanici.getCinsiyet());
            pstmt.setDate(4, new java.sql.Date(kullanici.getDogumTarihi().getTime()));
            pstmt.setString(5, kullanici.getSifre());
            pstmt.setString(6, kullanici.getEmail());

            pstmt.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KullaniciDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteKullanici(Kullanici kullanici) {
        String sqlStr = "DELETE FROM Kullanici WHERE email=?";
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arda?zeroDateTimeBehavior=convertToNull");
            PreparedStatement pstmt = con.prepareStatement(sqlStr);

            pstmt.setString(1, kullanici.getEmail());

            pstmt.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KullaniciDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
