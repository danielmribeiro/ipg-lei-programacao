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
public class Motorista extends Funcionario {
    public Motorista(){
        super();
        kilometros=0;
    } 
    
    public Motorista(String codigo, String nome, int dias, double km){
        super(codigo,nome,dias);
        this.kilometros = km;
    } 
    
    private double kilometros; 
    
    public double salario() {
        return this.getDias()*Empresa.getValorDia()+kilometros*Empresa.getValorKm() ;
    } 
    
    public String toString() {
        StringBuilder output = new StringBuilder();
        
        output.append("Nome = "+this.getNome()+"\n");
        output.append("Dias = "+this.getDias()+"\n");
        output.append("Codigo = "+this.getCodigo()+"\n");
        output.append("Kilometros = "+kilometros+"\n");
        output.append("Salario = "+salario()+"\n");
        return output.toString();
    }
}
