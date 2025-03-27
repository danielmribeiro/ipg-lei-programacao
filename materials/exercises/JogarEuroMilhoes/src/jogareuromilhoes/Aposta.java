/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogareuromilhoes;

import java.util.Comparator;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jfig
 */
public class Aposta implements Comparator<Aposta> {

    public Aposta() {
        aposta = new TreeSet<>();
    }

    public Aposta(int []v) {
        aposta = new TreeSet<>();
        for (int i=0;i<v.length;i++){
            aposta.add(v[i]);
        }
    }
    
    private Set<Integer> aposta;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aposta other = (Aposta) obj;
        if (!Objects.equals(this.aposta, other.aposta)) {
            return false;
        }
        if (!aposta.toString().equals(other.toString())){
            return false;
        }
        return true;
    }

    public int hashCode(){
        return (toString()).hashCode();
        
    }
    
    public String toString(){
        String output = "";
        for (Integer i:getAposta()){
            output += i+"\t";
        }
        return output;
    }
    private void gerarAposta(int min, int max, int n) {
        int x = 0;
        Random random = new Random();
        do {
            int numero = random.nextInt(max + 1 - min) + min;
            if (aposta.add(numero)) {
                x++;
            }
        } while (x < n);
    }

    /**
     * @return the aposta
     */
    public Set<Integer> getAposta() {
        return aposta;
    }
    
    
     public Set<Integer> getAposta(int min,int max,int n) {
         gerarAposta(min, max, n);
         return aposta;
    }
    

    /**
     * @param aposta the aposta to set
     */
    public void setAposta(Set<Integer> aposta) {
        this.aposta = aposta;
    }

    

    @Override
    public int compare(Aposta o1, Aposta o2) {
        if (o1.toString().equals(o2.toString())){
            return 1;
        }
        return -1;
    }

}
