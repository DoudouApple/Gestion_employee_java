/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Login;

/**
 *
 * @author bmd-tech
 */
public class Bean {
    private String nom;
    private String email ;
    private String password;

    public Bean(String nom, String email, String password) {
        this.nom = nom;
        this.email = email;
        this.password = password;
    }

    public String getNom() {
        return nom; 
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
   

  
   
    
    
    
    
    
    
    
    
    
    
    
}
