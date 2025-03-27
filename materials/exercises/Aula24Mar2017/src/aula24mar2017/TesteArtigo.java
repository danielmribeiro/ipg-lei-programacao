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
public class TesteArtigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artigo a1 = new Artigo("Nata", 0.75, 50);
        Artigo a2 = new Artigo("Sumol", 0.85, 125);
        Artigo a3 = new Artigo("Pastel de Chaves", 0.5, 5);
        
        ArrayList<Artigo> tArtigos = new ArrayList();
        
        tArtigos.add(a1);
        tArtigos.add(a2);
        tArtigos.add(a3);
        tArtigos.add(new Artigo("Chá", 0.6, 3));
        
        System.out.println("--- Listagem de Artigos ------");
        
        for (int i=0;i<tArtigos.size();i++){
            Artigo a = tArtigos.get(i);
            System.out.println(""+a.toString());
        }
        System.out.println("--- Listagem de Artigos com quantidade <10 ------");
        for (int i=0;i<tArtigos.size();i++){
            Artigo a = tArtigos.get(i);
            if (a.getQuantidade()<10){
                System.out.println(""+a.toString());
            }
        }
        System.out.println("--- Listagem de Artigos ------");
        for (Artigo a:tArtigos){
            System.out.println(""+a.toString());
        }
        
    }
    
}
