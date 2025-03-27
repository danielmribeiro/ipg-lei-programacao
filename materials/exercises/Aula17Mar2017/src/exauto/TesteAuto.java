/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exauto;

/**
 *
 * @author jfig
 */
public class TesteAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto opel = new Auto();
        Auto seat = new Auto(50);
        
        if (opel.getCombustivel()<20){
            opel.setCombustivel(100);
        }
        
        opel.ligar();
        opel.mudancaMais();
        opel.acelerar();
        opel.acelerar();
        opel.acelerar();
        opel.travar();
        opel.mudancaMais();
        opel.acelerar();
        System.out.println(""+opel.toString());
        
        
        
        System.out.println(""+opel.toString());
        System.out.println(""+seat.toString());
    }
    
}
