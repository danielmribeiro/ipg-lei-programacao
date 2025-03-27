/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19abr2017;

/**
 *
 * @author jfig
 */
public class Aula19Abr2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasseA a = new ClasseA();
        ClasseA b = new ClasseA();
        
        a.setValor(12);
        b.setValor(57);
        
        ClasseA.setTotal(100);
        System.out.println("Total = "+ClasseA.getTotal());
        
                
        
        
        System.out.println("a: "+a.getValor());
        System.out.println("b: "+b.getValor());
    }
    
}
