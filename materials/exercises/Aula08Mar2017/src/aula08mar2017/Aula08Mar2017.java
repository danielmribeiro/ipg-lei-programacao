/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula08mar2017;

import java.util.Scanner;

/**
 *
 * @author 1012527
 */
public class Aula08Mar2017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] notas = new double[250];
        String[] nomes = new String[250];
        int n;
        double soma, media;

//Ler e guardar as notas de n alunos:
//Notas entre 0 e 20;
        do {
            System.out.printf("Quantos alunos? ");
            n = input.nextInt();
            if ((n <= 0) || (n > 250)) {
                System.out.println("Erro...");
            }

        } while ((n <= 0) || (n > 250));
            
        for (int i = 0; i < n; i++) {
            System.out.println("Nome ["+(i+1)+"]?");
            nomes[i]=input.next();
        }
        
            
        }
            
            System.out.println("Nota do aluno "+ nomes[i]+"?");
            System.out.printf("Nota do aluno %s ?"+ nomes[i]);
        }
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Nota[" + (i + 1) + "]? ");
//                System.out.printf("Nota[%d]? ",(i+1));
                notas[i] = input.nextDouble();
                if ((notas[i] < 0) || (notas[i] > 20)) {
                    System.out.println("Valor Incorreto!");
                }
            } while ((notas[i] < 0) || (notas[i] > 20));
        }

//Calcular e escrever a média; 
        soma = 0;
        for (int i = 0; i < n; i++) {
            soma += notas[i];
        }
        media = soma / n;
        System.out.println("Media = " + media);
        System.out.printf("Media = %.2f", media);

//Calcular e escrever a maior e menor nota;
        double maior = notas[0];
        for (int i = 0; i < n; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        System.out.println("Maior nota =" + maior);

        double menor = notas[0];
        for (int i = 0; i < n; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        System.out.println("Menor nota =" + menor);

//Calcular e escrever a percentagem de aprovados e reprovados. 
        double pAprovados, pReprovados, somaAprovados;
        int nAprovados = 0;
        for (int i = 0; i < n; i++) {
            if (notas[i] >= 10) {
                nAprovados++;
            }
        }
        pAprovados = ((double) nAprovados / n) * 100;
        pReprovados = 100 - pAprovados;
        System.out.printf("Percentagem de Aprovados = %.2f", pAprovados);
        System.out.printf("Percentagem de Reprovados = %.2f", pReprovados);

//Visualizar todas as notas ordenadas por ordem decrescente.
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (notas[i]<notas[j]){
                    double aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    String auxs = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] =auxs;
                }
            }

        }
        System.out.println("-- Notas ordenadas --");
        for (int i = 0; i < n; i++) {
            System.out.println(nomes[i]+""+notas[i]);
        }

//Ordenar Alfabeticamente
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (nomes[i].compareTo(<nomes[j])>0){
                    double aux = notas[i];
                    notas[i] = notas[j];
                    notas[j] = aux;
                    String auxs = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] =auxs;
                }
            }

        }
        System.out.println("-- Ordenação alfabética --");
        for (int i = 0; i < n; i++) {
            System.out.println(nomes[i]+""+notas[i]);
        }


//Associar a cada nota o respetivo nome.
    
    
    }

}
