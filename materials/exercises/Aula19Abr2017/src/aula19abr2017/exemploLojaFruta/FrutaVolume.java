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
public class FrutaVolume extends Fruta{

    public FrutaVolume() {
        super();
        this.volume = 0;
    }

    public FrutaVolume(double volume, String nome, double preco) {
        super(nome, preco);
        this.volume = volume;
    }
    
    private double volume;

    public double apagar(){
        return this.getVolume() * this.getPreco();
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Nome = "+this.getNome()+"\n");
        output.append("Preço Volume = "+this.getPreco()+"\n");
        output.append("Volume = "+this.getVolume()+"\n");
        output.append("A Pagar = "+this.apagar()+"\n");
        
        return output.toString();
    }
    /**
     * @return the volume
     */
    public double getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    
}
