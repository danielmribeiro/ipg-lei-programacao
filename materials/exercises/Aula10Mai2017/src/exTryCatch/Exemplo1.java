/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exTryCatch;

import java.util.Scanner;

/**
 *
 * @author jfig
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        boolean erro = false;

        do {
            erro = false;
            try {
                //do {
                System.out.println("Valor Inteiro [0,100] ? ");
                valor = input.nextInt();
                if ((valor < 0) || (valor > 100)) {
                    System.out.println("Valor incorreto!!!");
                    erro = true;
                }
                //} while ((valor < 0) || (valor > 100));
            } catch (java.util.InputMismatchException e) {
                System.out.println("Valor não é numero...");
                erro = true;
                input.next();
            }
        } while (erro);

    }

}
