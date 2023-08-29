/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;


import com.databaseCon.DB;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author bmd-tech
 */
public class HomeBal {
    
    
    
    public List<HomeBean> loadData() {
        List<HomeBean> list = new ArrayList<HomeBean>();
        
        try {
        String query = "select * from employee ";
        PreparedStatement ps = DB.con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()) {
            int ide = rs.getInt("ide");
            String prenom = rs.getString("prenom");
            String nom = rs.getString("nom");
            String  sexe = rs.getString("sexe");
            String pays = rs.getString("pays");
            String addresse = rs.getString("addresse");
            Date date = rs.getDate("date");
            
            HomeBean bean = new HomeBean(ide, prenom,nom,sexe,pays,addresse,date);
            list.add(bean);
        }
        
        
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,""+ e);
        }
        return list;
    }
    
    
    public void insert(HomeBean homeBean) {
    
        try{
            String query = "insert into employee values (null,?,?,?,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1,homeBean.getPrenom());
            ps.setString(2,homeBean.getNom());
            ps.setString(3, homeBean.getSexe());
            ps.setString(4, homeBean.getPays());
            ps.setString(5, homeBean.getAddresse());
            ps.setObject(6, homeBean.getDate());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Insertion reussi." );
            
                    
        }catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Echec de l'insertion . "+e); 
        
        }
    
    }
    
    public HomeBean returnAllDataToTextFields(int ide) {
        HomeBean bean = null;
        
        try {
        
            String query = "select * from employee where Ide ="+ide;
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()) {
                int ids = rs.getInt("ide");
                String prenom = rs.getString("prenom");
                String nom = rs.getString("nom");
                String  sexe = rs.getString("sexe");
                String pays = rs.getString("pays");
                String addresse = rs.getString("addresse");
                Date date = rs.getDate("date");
                bean = new HomeBean(ids,prenom,nom,sexe,pays,addresse,date);
            }
        }catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, ""+e);
            
        }
        return bean;
    
    }
    
   public void updateData(HomeBean bean) {
       try {
       String query = "update employee set Prenom = ?, Nom = ?, Sexe = ?, Pays = ?, Addresse = ?, Date = ? where Ide = ?";
       PreparedStatement ps = DB.con.prepareStatement(query);
       ps.setString(1, bean.getPrenom());
       ps.setString(2,bean.getNom());
       ps.setString(3, bean.getSexe());
       ps.setString(4, bean.getPays());
       ps.setString(5, bean.getAddresse());
       ps.setObject(6, bean.getDate());
       ps.setInt(7, bean.getIde());
       
       
       ps.executeUpdate();
       
       JOptionPane.showMessageDialog(null, "Modifier avec succes . ");
       
       
       
       
       }catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, ""+e);
           
       
       }
   } 
   
   
   public void deleteRecord (int id) {
       try{
           String query = "delete from employee where ide = ?";
           PreparedStatement ps = DB.con.prepareStatement(query);
           ps.setInt(1, id);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null,"Supprimer avec succes");
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, ""+e);
       }
   }
    
    
}
