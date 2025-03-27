/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19abr2017.exemploLojaFruta;

import java.util.ArrayList;

/**
 *
 * @author jfig
 */
public class CabazDeFruta {

    public CabazDeFruta() {
        cabaz = new ArrayList<>();
    }
    
    private ArrayList<Fruta> cabaz;
 
    public void addFruta(Fruta f){
        cabaz.add(f);
    }
    
    public double valorTotal(){
        double total = 0;
        for (Fruta f:cabaz){
            total += f.apagar();
        }
        return total;
    }
    
    public double valorTotalPorTipo(String tipo){
        double total = 0;
        for (Fruta f:cabaz){
            if (f.getClass().getSimpleName().equals(tipo)){
                total += f.apagar();
            }
        }
        return total;
    }
    
}
