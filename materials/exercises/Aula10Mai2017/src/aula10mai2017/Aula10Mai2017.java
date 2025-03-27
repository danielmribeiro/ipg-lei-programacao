/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10mai2017;

/**
 *
 * @author jfig
 */
public class Aula10Mai2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculoNormal cn = new CalculoNormal();
        CalculoAbsoluto ca = new CalculoAbsoluto();
        Calculadora cca = new CalculoNormal();
        NovoCalculo nc = new NovoCalculo();
        CalculoMultiplica cm = new CalculoMultiplica();
        CalculoMultiplica2 cm2 = new CalculoMultiplica2();
        
        System.out.println("Normal: "+cn.soma(5, 7));
        System.out.println("Absoluto: "+ca.soma(-5, 7));
        System.out.println("Outro: "+cca.soma(5, 7));
        
        System.out.println("Novo multiplica: "+ nc.multiplica(5, 7));
        System.out.println("Multiplica: "+cm.multiplica(5, 7));
        System.out.println("Multiplica2: "+cm2.multiplica(5, 7));
        
    }
    
}
