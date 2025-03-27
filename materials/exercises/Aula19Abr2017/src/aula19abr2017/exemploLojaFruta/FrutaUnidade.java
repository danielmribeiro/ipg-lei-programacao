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
public class FrutaUnidade extends Fruta{

    public FrutaUnidade(){
        super();
        quantidade = 0;
    }
    
    public FrutaUnidade(int quantidade, String nome, double preco){
        super(nome,preco);
        this.quantidade = quantidade;
    }
    
    private int quantidade;

    public double apagar(){
        return this.getQuantidade() * this.getPreco();
    }
    
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Nome = "+this.getNome()+"\n");
        output.append("Preço Quantidade = "+this.getPreco()+"\n");
        output.append("Quantidade = "+quantidade+"\n");
        output.append("A Pagar = "+this.apagar()+"\n");
        
        return output.toString();
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
}
