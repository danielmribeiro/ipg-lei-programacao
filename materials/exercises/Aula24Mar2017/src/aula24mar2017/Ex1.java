/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24mar2017;

import java.util.ArrayList;

/**
 *
 * @author jfig
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList nomes = new ArrayList();
        
        nomes.add("Maria");
        nomes.add("Manuel");
        nomes.add("Ana");
      
        for (int i=0;i<nomes.size();i++){
            String nome = (String)nomes.get(i);
            System.out.println(""+nomes.get(i));
        }
        
        for (Object s : nomes){
            System.out.println(""+s);
        }
        
        ArrayList<String> clubes = new ArrayList();
        
        clubes.add("Vianense");
        clubes.add("Rio Ave");
        clubes.add("Varzim");
        
        for (int i=0;i<clubes.size();i++){
            String c = clubes.get(i);
            System.out.println(""+c);
        }
        
        
       
    }
    
}
