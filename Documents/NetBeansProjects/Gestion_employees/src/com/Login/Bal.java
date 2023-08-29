   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Login;


import com.databaseCon.DB;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author bmd-tech
 */
public class Bal {
    
    public void insertDataSignup(Bean beanObj){
        try{
            String query = "insert into signup values (null,?,?,?)";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ps.setString(1,beanObj.getNom());
            ps.setString(2,beanObj.getEmail());
            ps.setString(3,beanObj.getPassword());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inscription reussi");
    
    }catch(Exception e ){
    JOptionPane.showMessageDialog(null,"" +e);
        }
    }
    
    
    public boolean checkLogin(String email, String password){
        boolean b = false;
        try {
            
            String query = "Select Email ,Password from signup where Email = '"+email+"' AND Password = '"+password+"'";
            java.sql.Statement st = DB.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                b = true;
            
            }else{
                  JOptionPane.showMessageDialog(null, "Mail ou mot de passe incorrect");
            }
            
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error = " +e);
        
        }
        
        return b;
    
    }

    
    
    
}
