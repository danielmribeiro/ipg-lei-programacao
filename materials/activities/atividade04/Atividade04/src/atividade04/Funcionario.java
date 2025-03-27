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
public abstract class Funcionario {
    public Funcionario(){
        this.codigo="";
        this.nome= "";
        this.dias= 0;
    }
    
    
    
    public Funcionario(String codigo, String nome, int dias){
        this.codigo= codigo;
        this.nome= nome;
        this.dias= dias;
    } 
    private String codigo; 
    private String nome; 
    private int dias; 
    
    public abstract double salario();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public abstract String toString() ;   
    
    
}
