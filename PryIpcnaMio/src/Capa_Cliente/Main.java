
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Cliente;

import javax.swing.UIManager;


public class Main {
//    gl..ss


    
    public static void main(String[] args) throws Exception{
        FrmLogin obj = new FrmLogin();
        obj.setVisible(true);
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
    }
    
}
