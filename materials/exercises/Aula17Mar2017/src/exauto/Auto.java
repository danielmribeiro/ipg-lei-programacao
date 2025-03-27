/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exauto;

/**
 *
 * @author jfig
 */
public class Auto {

    public Auto(){
        ligado = false;
        combustivel = 10;
        mudanca = 0;
        velocidade = 0;
    }

    public Auto(int combustivel) {
        this.combustivel = combustivel;
        ligado = false;
        mudanca = 0;
        velocidade = 0;
    }

    public Auto(boolean ligado,
                int combustivel,
                int mudanca,
                int velocidade) {
        this.ligado = ligado;
        this.combustivel = combustivel;
        this.mudanca = mudanca;
        this.velocidade = velocidade;
    }
    
    private boolean ligado;
    private int combustivel;
    private int mudanca;
    private int velocidade;

    public void ligar(){
        ligado = true;
//        this.setLigado(true);
    }
    
    public void desligar(){
        ligado = false;
    }
    
    public void mudancaMais(){
        if (mudanca<6){
            mudanca++;
        }
    }
    
    public void mudancaMenos(){
        if (mudanca>-1){
            mudanca--;
        }
    }
    
    public void acelerar(){
        if (ligado && (combustivel>0) && mudanca>0){
            velocidade++;
            combustivel--;
        }
    }
    
    public void travar(){
        if (velocidade >0){
            velocidade--;
        }
    }
    
    @Override
    public String toString() {
        return "Auto{" + "ligado=" + ligado +
                ", combustivel=" + combustivel +
                ", mudanca=" + mudanca +
                ", velocidade=" + velocidade + '}';
    }
    
    
    
    public int getCombustivel(){
        return combustivel;
    }
    public void setCombustivel(int valor){
        combustivel = valor;
    }

    /**
     * @return the mudanca
     */
    public int getMudanca() {
        return mudanca;
    }

    /**
     * @param mudanca the mudanca to set
     */
    public void setMudanca(int mudanca) {
        this.mudanca = mudanca;
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the ligado
     */
    public boolean isLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
}
