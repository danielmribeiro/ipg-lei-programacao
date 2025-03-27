/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbd2017;

/**
 *
 * @author jfig
 */
public class Artigo {
   
    public Artigo(){
        nome = "";
        preco = 0;
        quantidade = 0;
    }
    
    public Artigo(String nome,double preco,int q){
        this.nome = nome;
        this.preco = preco;
        quantidade = q;
    }
    
    public Artigo(String nome){
        this.nome = nome;
        preco = 0;
        quantidade = -1;        
    }
    
    private String nome;
    private double preco;
    private int quantidade;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double valor){
        this.preco = valor;
    }
    public void setPreco(int valor){
        this.preco = valor;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String toString(){
        return "Nome: "+nome+
               " Preço: "+preco+
               " Quantidade: "+quantidade+"\n"; 
    }
    
}
