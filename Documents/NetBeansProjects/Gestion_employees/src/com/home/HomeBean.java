/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import java.util.Date;

/**
 *
 * @author bmd-tech
 */
public class HomeBean {
    private int ide;
    private String prenom;
    private String nom;
    private String sexe;
    private String pays;
    private String addresse;
    private Date date;

    public HomeBean(int ide,String prenom, String nom, String sexe, String pays, String addresse, Date date) {
        this.ide = ide;
        this.prenom = prenom;
        this.nom = nom;  
        this.sexe = sexe;
        this.pays = pays;
        this.addresse = addresse;
        this.date = date;
    }

    public int getIde() {
        return ide;
    }

    public void setIde(int ide) {
        this.ide = ide;
    }

    HomeBean(String prenom, String nom, String sexe, String pays, Date date, String addresse ) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
