/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24mar2017;

/**
 *
 * @author jfig
 */
public class TesteGestaoArtigos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestaoArtigos g = new GestaoArtigos();
        Artigo a = new Artigo("Café", 0.4, 100);
        
        g.addArtigo("Chá", 0.6, 200);
        g.addArtigo(a);
        
        g.addArtigo("Chá", 0.6, 200);
        g.addArtigo(a);
        
        g.addArtigo("Sumol", 0.75, 155);
        
        System.out.println(""+g.toString());
        
        System.out.println("Preço do café: "+g.getPrecoArtigo("café"));
    }
    
}
