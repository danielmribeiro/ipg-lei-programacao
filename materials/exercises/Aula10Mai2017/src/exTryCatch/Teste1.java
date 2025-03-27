/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exTryCatch;

/**
 *
 * @author jfig
 */
public class Teste1 {

    private static String leStr() {
        int ch;
        String s = "";
        boolean fim = false;
        while (!fim) {
            try {
                ch = System.in.read();
                if ((ch < 0) || ((char) ch == '\n')) {
                    fim = true;
                } else {
                    s += (char) ch;
                }
            } catch (java.io.IOException e) {
                fim = true;
            }
        }
        return s;
    } // Fim leStr()

    public static void main(String args[]) {
        boolean fim = false;
        int index;
        String palavra = "";
        String[] tabPalavras = new String[10];
        System.out.print("Int. uma palavra : ");
        System.out.flush();
        palavra = leStr();
        while (!palavra.equals(" ")) {
            System.out.print("Introduza um indice : ");
            System.out.flush();
            try {
                index = Integer.valueOf(leStr().trim()).intValue();
                tabPalavras[index] = palavra;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice fora dos limites!!!");
            } catch (  java.lang.NumberFormatException e){
                System.out.println("Formato incorreto!!!");
            }

            System.out.print("Int. uma palavra : ");
            System.out.flush();
            palavra = leStr();
        }
    } // Fim main
} // Fim class Teste1
