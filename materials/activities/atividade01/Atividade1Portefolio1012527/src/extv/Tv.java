/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extv;

/**
 *
 * @author Asus
 */
public class Tv {
    public Tv(){
        ligado = false;
        som = 30;
        canal = 0;
        volume = 0;
    }

    public Tv(boolean ligado,
                int som,
                int canal,
                int volume) {
        this.ligado = ligado;
        this.som = som;
        this.canal = canal;
        this.volume = volume;
    }
    
    private boolean ligado;
    private int som;
    private int canal;
    private int volume;

    public void ligar(){
        ligado = true;
//        this.setLigado(true);
    }
    
    public void desligar(){
        ligado = false;
    }
    
    public void canalMais(){
        if (canal<99){
            canal++;
        }
    }
    
    public void volumeMenos(){
        if (volume>0){
            volume--;
        }
    }
    public void volumeMais(){
        if (volume<100){
            volume++;
        }
    }
    
    public void canalMenos(){
        if (canal>1){
            canal--;
        }
    }
    
    @Override
    public String toString() {
        return "Tv{" + "ligado=" + ligado +
                ", som=" + som +
                ", canal=" + canal +
                ", volume=" + volume + '}';
    }
    
    
    
    public int getSom(){
        return som;
    }
    public void setSom(int valor){
        som = valor;
    }

    /**
     * @return the canal
     */
    public int getCanal() {
        return canal;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(int canal) {
        this.canal = canal;
    }
/**
     * @return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(int volume) {
        this.volume = volume;
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
