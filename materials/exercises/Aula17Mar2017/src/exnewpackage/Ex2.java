/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exnewpackage;

import aula17mar2017.ExAcesso;



/**
 *
 * @author jfig
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExAcesso a = new ExAcesso();
        
        a.iPublic = 1;
               
        System.out.println(""+a.toString());
    }
    
}
