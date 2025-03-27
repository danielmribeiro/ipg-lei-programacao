/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19abr2017.exemploLojaFruta;

/**
 *
 * @author jfig
 */
public class TesteCabazFruta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CabazDeFruta cabaz = new CabazDeFruta();
        Fruta f = new FrutaPeso(2.2, "Bananas", 1.5);
        
        cabaz.addFruta(f);
        cabaz.addFruta(new FrutaPeso(3.5, "Laranjas", 1.25));
        
        cabaz.addFruta(new FrutaUnidade(2, "Papaia",  3.75));
        
        System.out.println("Valor FrutaUnidade = "+cabaz.valorTotalPorTipo("FrutaUnidade"));
        System.out.println("Valor FrutaUnidade = "+cabaz.valorTotalPorTipo("FrutaPeso"));
        System.out.println("Total a pagar = "+cabaz.valorTotal());
    }
    
}
