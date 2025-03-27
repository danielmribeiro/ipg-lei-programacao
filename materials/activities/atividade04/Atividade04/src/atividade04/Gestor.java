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
public class Gestor extends Funcionario {
    
    public Gestor(){
        super();
    } 
    
    public Gestor(String codigo, String nome, int dias, double premio){
        super(codigo,nome,dias);
        this.premio=premio;
    } 
    
    private double premio; 
    
    public double salario() {
        return this.getDias()*Empresa.getValorDia()+premio+Empresa.getPremio();
    } 
    
    public String toString() {
        StringBuilder output = new StringBuilder();
        
        output.append("Nome = "+this.getNome()+"\n");
        output.append("Dias = "+this.getDias()+"\n");
        output.append("Codigo = "+this.getCodigo()+"\n");
        output.append("Premio = "+premio+"\n");
        output.append("Salario = "+salario()+"\n");
        return output.toString();
    }
}
