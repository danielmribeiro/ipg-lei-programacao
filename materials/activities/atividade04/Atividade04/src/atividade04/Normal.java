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
public class Normal extends Funcionario {
    
    public Normal(){
        super();    
    }

    public Normal(String codigo, String nome, int dias) {
        super(codigo, nome, dias);
    }
    
   
    @Override
    public double salario() {
        
         return this.getDias() * Empresa.getValorDia();
    }
    
    public String toString(){
        StringBuilder output = new StringBuilder();
        
        output.append("Nome = "+this.getNome()+"\n");
        output.append("Dias = "+this.getDias()+"\n");
        output.append("Codigo = "+this.getCodigo()+"\n");
        output.append("Salario = "+salario()+"\n");
        return output.toString();
        
    }
    
}
