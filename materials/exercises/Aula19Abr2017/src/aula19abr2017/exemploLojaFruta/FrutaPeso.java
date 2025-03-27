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
public class FrutaPeso extends Fruta {

    public FrutaPeso() {
        super();
        peso = 0;
    }

    public FrutaPeso(double peso, String nome, double preco) {
        super(nome, preco);
        this.peso = peso;
    }
    
    private double peso;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public double apagar() {
        return peso * this.getPreco();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Nome = "+this.getNome()+"\n");
        output.append("Preço Peso = "+this.getPreco()+"\n");
        output.append("Peso = "+peso+"\n");
        output.append("A Pagar = "+this.apagar()+"\n");
        
        return output.toString();
    }
    
    
}
