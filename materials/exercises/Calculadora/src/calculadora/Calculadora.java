/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Asus
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    
public static int somaLinear(int n) {
    if(n==1) return 1;
    else return n + somaLinear(n-1);  
}

public static int somaVetor(int v[], int i){
    if (i==0) return v[0];
    else return somaVetor(v,i-1)+v[i];
}

public static int multiplicar(int a, int b){
    if(a==0){
        return 0;
    }else{
        return b+multiplicar(a-1,b);
    }
}

public static int primo(int n, int div){
    if((div==1)||(div==0)){
        return 1;
    }
    else if (n%div==0){
        return 0;
    }else{
        return primo(n,div-1);
    }  
}

    public static void main(String[] args) {
        System.out.println("SomaLinear(10)=" +somaLinear(10));
        int v[]={4,5,6,9};
        System.out.println("Soma v[4,5,6,9]="+somaVetor(v, v.length-1));
        System.out.println("Multiplicação="+multiplicar(3,10));
        for(int i=1; i<=100; i++){
            if(primo(i,i/2)==1){
                System.out.printf("  "+i);
            }
        }
    }
}