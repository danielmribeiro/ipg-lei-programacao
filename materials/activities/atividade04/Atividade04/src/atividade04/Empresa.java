/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Empresa {
    
    private static double valorDia = 35.0; 
    private static double valorKm = 0.025; 
    private static double comissao = 0.05; 
    private static double premio = 0.15; 

    public static double getValorDia() {
        return valorDia;
    }

    public static void setValorDia(double valorDia) {
        Empresa.valorDia = valorDia;
    }

    public static double getValorKm() {
        return valorKm;
    }

    public static void setValorKm(double valorKm) {
        Empresa.valorKm = valorKm;
    }

    public static double getComissao() {
        return comissao;
    }

    public static void setComissao(double comissao) {
        Empresa.comissao = comissao;
    }

    public static double getPremio() {
        return premio;
    }

    public static void setPremio(double premio) {
        Empresa.premio = premio;
    }

    public ArrayList<Funcionario> gettFuncionarios() {
        return tFuncionarios;
    }

    public void settFuncionarios(ArrayList<Funcionario> tFuncionarios) {
        this.tFuncionarios = tFuncionarios;
    }

    public Empresa(){
        tFuncionarios= new ArrayList<>();
    } 
    
    private ArrayList<Funcionario> tFuncionarios; 
    public double total;
    public int tota;
    public String output;
    
    public void addFuncionario(Funcionario f){
        tFuncionarios.add(f);
    }
    public boolean existeFuncionario(String codigo){
        for(Funcionario f:tFuncionarios){
            if(f.getCodigo()== codigo){
                return true;
            }     
        }
        return false;
    } 
    
    public Funcionario daFicha(String codigo){ 
        for(Funcionario f:tFuncionarios){
            if(f.getCodigo().equals(codigo)){
                return f;
            }
        }
        return null;
    }
    
    public String daFichaS(String codigo){
        output="";
        for(Funcionario f:tFuncionarios){
            if(f.getCodigo().equals(codigo)){
                output=""+f.getClass()+" "+f.getCodigo()+" "+f.getNome()+" "+f.getDias();
                return output;
            }
        }
        return output;
    }
    public String toString(){
        output= "";
        for(Funcionario f:tFuncionarios){
            output=output+f.toString();
        }
        return output;
    } 
    public double totalSalarios(){
        total=0;
        for(Funcionario f:tFuncionarios){
            total=total+f.salario();
        }
        return total;
        
    }
    
    public double totalSalariosTipo(String tipo){
        total=0;
        for(Funcionario f:tFuncionarios){
            if(f.getClass().getSimpleName().equals(tipo)){
                total=total+f.salario();
            }
        }
        return total;
        
    }
    
    public int numTotalDeTipo(String tipo){
        for(Funcionario f:tFuncionarios){
          if(f.getClass().getSimpleName().equals(tipo)){
            tota=tota+1;
            }
        }
       return tota;
    }
}
