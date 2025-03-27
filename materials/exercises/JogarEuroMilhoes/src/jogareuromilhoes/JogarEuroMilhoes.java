/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogareuromilhoes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author jfig
 */
public class JogarEuroMilhoes {

    private static void escreveFicheiro(String nome) throws IOException{
        FileWriter f = new FileWriter(nome);
        PrintWriter file = new PrintWriter(f);
        for (int i=0;i<100000;i++){ Aposta aposta = new Aposta();
            aposta.getAposta(1, 50, 5);
            file.printf("%s\n", aposta.toString());
        }
        file.close();
        f.close();
    }
    
    private static void escreveFicheiroJogo(String nome, Map<Set<Integer>,Integer> jogo ) throws IOException{
        FileWriter f = new FileWriter(nome);
        PrintWriter file = new PrintWriter(f);
        Iterator<Entry<Set<Integer>,Integer>> it = jogo.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Set<Integer>,Integer> par = it.next();
            file.printf("%s : %d\n", par.getKey().toString(),par.getValue());
        }
        file.close();
        f.close();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Map<Set<Integer>,Integer> jogo = new HashMap<>();
        
        Scanner fileScanner = new Scanner(new File("ApostasMilhoes.txt"));
        int x =0;
        while (fileScanner.hasNextInt()&& (x<5)) {
            int []v = new int[5];
            for (int j=0;j<5;j++){
                int i = fileScanner.nextInt();
//                System.out.println(""+i);
                v[j] = i;
            }
            Aposta aposta = new Aposta(v);
            Integer freq = jogo.get(aposta.getAposta());
            jogo.put(aposta.getAposta(), (freq == null) ? 1 : freq + 1);
//            x++;
        }
        System.out.println("Tamanho: "+jogo.size());
        escreveFicheiroJogo("ApostasRepetidas.txt",jogo);
        
//        Set<Integer> chave = new Aposta().getAposta(1, 50, 5);
//        int []sorteio = {4,30,34,46,49};
//        Set<Integer> chave = new Aposta(sorteio).getAposta();
//        System.out.println("Chave: " + chave);
//        System.out.println("Tamanho: " + chave.size());

        
        
//        escreveFicheiro("ApostasMilhoes.txt"); 
        
        
//        for (int i = 0; i < 100000; i++) {
//   
//            Aposta aposta = new Aposta();
//            Set<Integer> intersecao = new TreeSet<>(chave);
////            System.out.println(i+" : "+aposta.getAposta(1, 50, 5));
//            intersecao.retainAll(aposta.getAposta(1, 50, 5));
////            intersecao.retainAll(aposta.getAposta());
//            if ((intersecao.size() == 5) || (intersecao.size() == 4)) {
//                System.out.println("Número de acertos: " + intersecao.size()
//                        + "\tNúmeros: " + intersecao);
//            }
//        }

    }
}
