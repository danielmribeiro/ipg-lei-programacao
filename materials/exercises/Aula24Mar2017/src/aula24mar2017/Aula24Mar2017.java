/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula24mar2017;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jfig
 */
public class Aula24Mar2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList v = new ArrayList();
        int [] vc = new int[100];
        Scanner input = new Scanner(System.in);
       
        for (int i=0;i<10;i++){
            vc[i] = i;
        }
        
        System.out.println("Quantos valores? ");
        int n = input.nextInt();
        for (int i=0;i<n;i++){
            System.out.println("V["+i+"]? ");
//            System.out.printf("V[%d]? ",i);
            int valor = input.nextInt();
            v.add(valor);
        }
        
        for (int i=0;i<v.size();i++){
            System.out.println(""+v.get(i));
            System.out.printf("%d",v.get(i));
        }
        
        
    }
    
}
