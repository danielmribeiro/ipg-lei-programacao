/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

/**
 *
 * @author Asus
 */
public class Comercial extends Funcionario {
    
    public Comercial(){
        super();
        vendas=0;
    } 
    
    public Comercial(String codigo, String nome, int dias, double vendas){
        super(codigo,nome,dias);
        this.vendas=vendas;
    }
    
    private double vendas; 
    
    public double salario() { 
        return this.getDias()*Empresa.getValorDia()+vendas*Empresa.getComissao();
    } 
    
    public String toString() {
        StringBuilder output = new StringBuilder();
        
        output.append("Nome = "+this.getNome()+"\n");
        output.append("Dias = "+this.getDias()+"\n");
        output.append("Codigo = "+this.getCodigo()+"\n");
        output.append("Vendas = "+vendas+"\n");
        output.append("Salario = "+salario()+"\n");
        return output.toString();
    }    
    
}
