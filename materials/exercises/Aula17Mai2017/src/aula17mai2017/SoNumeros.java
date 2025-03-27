/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula17mai2017;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author jfig
 */
public class SoNumeros extends PlainDocument {

    public SoNumeros() {
        super();
        tamanho = 512;
    }

    
    public SoNumeros(int valor) {
        super();
        tamanho = valor;
    }

    private int tamanho;

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        char carater;
        boolean numero = true;

        carater = str.charAt(0);
        if (!Character.isDigit(carater)) {
            numero = false;
        }
        int max = getLength() + str.length();

        if (numero) {
            if (max <= tamanho) {
                super.insertString(offs, str, a);
            }
        }
    }
}
