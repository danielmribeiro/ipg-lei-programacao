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
public class CalculoMultiplica implements Calculadora{

    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrai(int a, int b) {
        return Math.max(a, b) - Math.min(a, b);
    }
    
    public int multiplica(int a, int b){
        int total = 0;
        for (int i = 1; i <= a ; i++) {
            total += b;
        }
        return total;
    }
    
}
