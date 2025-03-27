/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03mar2017;

import java.util.Scanner;

/**
 *
 * @author 1012527
 */
public class Aula03Mar2017 {

    /**6
     **
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        int soma;
        
        System.out.printf("Valor? ");
        x = input.nextInt();
        System.out.println("Valor? ");
        y = input.nextInt();
        soma = x + y;
        System.out.println("Soma = "+soma);
        System.out.printf("Soma = %d\n",soma);
    }
    
}
