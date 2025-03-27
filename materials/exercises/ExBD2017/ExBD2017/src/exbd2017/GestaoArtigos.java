/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exbd2017;

import java.util.ArrayList;

/**
 *
 * @author jfig
 */
public class GestaoArtigos {
    
    public GestaoArtigos(){
        tArtigos = new ArrayList();
    }
    
    private ArrayList<Artigo> tArtigos;

    public void addArtigo(String nome,double preco,
                            int quantidade){
        if (!existeArtigo(nome)){
            tArtigos.add(new Artigo(nome, preco, quantidade));
        }
    }
    public void addArtigo(Artigo a){
        if(!existeArtigo(a.getNome())){
            tArtigos.add(a);
        }
    }
    public boolean existeArtigo(String nomepesquisa){
        boolean existe = false;
        for (int i=0;i<tArtigos.size();i++){
            Artigo a = tArtigos.get(i);
            if (a.getNome().equalsIgnoreCase(nomepesquisa)){
                existe = true;
            }
        }
        return existe;
    }
    public boolean existeArtigo1(String nomepesquisa){
        boolean existe = false;
        for (int i=0;i<tArtigos.size();i++){
            Artigo a = tArtigos.get(i);
            if (a.getNome().equalsIgnoreCase(nomepesquisa)){
                existe = true;
                break;
            }
        }
        return existe;
    }
    public boolean existeArtigo2(String nomepesquisa){
        boolean existe = false;
        int i=0;
        while(!existe && (i<tArtigos.size())){
            Artigo a = tArtigos.get(i);
            if (a.getNome().equalsIgnoreCase(nomepesquisa)){
                existe = true;
            }
            i++;
        }
        return existe;
    }
    
    public boolean existeArtigo3(String nomepesquisa){
        for (Artigo a : tArtigos){
            if (a.getNome().equalsIgnoreCase(nomepesquisa)){
                return true;
            }
        }
        return false;
    }
    
    public double getPrecoArtigo(String nomepesquisa){
        for (Artigo a : tArtigos){
            if (a.getNome().equalsIgnoreCase(nomepesquisa)){
                return a.getPreco();
            }
        }
        return 0;
    }
    
    public String toString(){
        String output = "";
        for (Artigo a : tArtigos){
            output += a.toString();
        }
        return output;
    }
    
    /**
     * @return the tArtigos
     */
    public ArrayList<Artigo> gettArtigos() {
        return tArtigos;
    }

    /**
     * @param tArtigos the tArtigos to set
     */
    public void settArtigos(ArrayList<Artigo> tArtigos) {
        this.tArtigos = tArtigos;
    }
    
}
