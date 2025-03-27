/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Atividade04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Empresa a = new Empresa();
         
         a.addFuncionario(new Comercial("1","Anacleto",30,43.0));
         a.addFuncionario(new Gestor("2","Abel",30,12.0));
         a.addFuncionario(new Normal("3","Ana",28));
         a.addFuncionario(new Motorista("4","Daniel",29,340.0));
         System.out.println(""+a.toString());
         System.out.println(""+a.existeFuncionario("142522342"));
         System.out.println(""+a.existeFuncionario("2"));
         System.out.println(""+a.totalSalariosTipo("Gestor"));
         System.out.println(""+a.numTotalDeTipo("Motorista"));
         System.out.println(""+a.totalSalarios());      
        
        
        
    }
    
}
