/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19abr2017;

/**
 *
 * @author jfig
 */
public class ClasseA {

// Variáveis de Classe
    private static int total;
        
// Métodos de Classe

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        ClasseA.total = total;
    }
    
    
// Construtores
    
    
    public ClasseA() {
        nome = "";
        valor = 0;
    }

    public ClasseA(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    
//Variáveis de instância
    private String nome;
    private int valor;

// Métodos de instância

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ClasseA{" + "nome=" + nome + ", valor=" + valor + '}';
    }
    
    
}
