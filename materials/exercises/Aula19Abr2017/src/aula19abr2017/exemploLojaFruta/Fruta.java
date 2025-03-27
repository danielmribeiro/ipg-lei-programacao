/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19abr2017.exemploLojaFruta;

/**
 *
 * @author jfig
 */
public abstract class Fruta {

    public Fruta() {
        nome = "";
        preco = 0;
    }

    public Fruta(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    private String nome;
    private double preco;

    
    public abstract double apagar();
    public abstract String toString();
    
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
