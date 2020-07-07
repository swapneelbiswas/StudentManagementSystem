/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagementsystem;

import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Administrator
 */
public class SchoolManagementSystem {

    public static void main(String[] args) {
        // TODO code application logic here
        logInPage LP= new logInPage();
       
        LP.setVisible(true);
        LP.setResizable(false);
        LP.setDefaultCloseOperation(LP.DO_NOTHING_ON_CLOSE);
        
        //StudentProfile SP= new StudentProfile();
       
        //SP.setVisible(true);
        
        
        //----------Fahim---------//
        JConnection db = new JConnection();
        db.connectdb();
          
        
    }
    
}
