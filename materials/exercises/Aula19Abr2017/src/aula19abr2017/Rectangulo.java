/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19abr2017;

/**
 *
 * @author jfig
 */
public class Rectangulo extends Forma {

    public Rectangulo() {
        comprimento = 0.0;
        largura = 0.0;
    }

    public Rectangulo(double c, double l) {
        comprimento = c;
        largura = l;
    }
    private double comprimento, largura;

    public double perimetro() {
        return 2 * (comprimento + largura);
    }

    public double area() {
        return comprimento * largura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

}
