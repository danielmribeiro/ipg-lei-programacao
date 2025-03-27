/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17mai2017;

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
        do {
            System.out.println("Valor [1,100]? ");
            while (!input.hasNextInt()) {
                System.out.println("Valor incorreto!");
                input.next();
            }
            valor = input.nextInt();
            if ((valor < 1) || (valor > 100)) {
                System.out.println("Valor fora do intervalo!");
            }
        } while ((valor < 1) || (valor > 100));
        System.out.println("Valor: " + valor);

        String vogal;
        String formato = "aeiou";
        System.out.println("Vogal minuscula? ");
        while(!input.hasNext("["+formato+"]")){
            System.out.println("Não é vogal!");
            input.next();
        }
        vogal = input.next();
        System.out.println("Letra: "+vogal);
        
        String numero;
        System.out.println("Numero [1,5]? ");
        while(!input.hasNext("[1-5]")){
            System.out.println("Numero incorreto!");
            input.next();
        }
        numero = input.next();
        System.out.println("Numero: "+numero);
        
    }

}
