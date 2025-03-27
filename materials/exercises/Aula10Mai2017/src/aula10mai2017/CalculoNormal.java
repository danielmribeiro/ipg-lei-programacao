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
public class CalculoNormal implements Calculadora{

    @Override
    public int soma(int a, int b) {
        return a + b;
    }

    @Override
    public int subtrai(int a, int b) {
        int resultado;
        resultado = a - b;
        return resultado;
    }
    
}
