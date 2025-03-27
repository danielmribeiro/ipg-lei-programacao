/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07jun2017;

/**
 *
 * @author Asus
 */
public class Servicos {
    
    public static int[][] lerFicheiro(String nomeFicheiro) throws FileNotFound{
        Scanner lerFile = new 
    }
    
    public static void escreverMatriz(int [][]m,int linhas, int colunas){
        int [][]m = Servicos.lerFicheiro("matriz.txt");
        lerFile.escreverMatriz
    }
    
    public static int gerarNumero (int minimo, int maximo){
        Random random = new Random();
        int valor = random.nextInt((Maximo - minimo) + 1) + minimo;
        return valor;
    }
    
    private void escreverFicheiroTxt(String nome){
        FileWriter arq = new FileWriter(nome);
        PrintWriter gravarArq = new PrintWriter(arq);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0;j < colunas; j++) {
                gravarArq.printf("%5d")
            }
        }
        gravarArq.printf("%5d", gerarNumero(-100, 200));
        arq.close();
    }
}
