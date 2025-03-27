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
public class SoLetras extends PlainDocument {

    public SoLetras() {
        super();
        tamanho = 512;
    }

    
    public SoLetras(int valor) {
        super();
        tamanho = valor;
    }

    private int tamanho;

    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        char carater;
        boolean letra = true;

        carater = str.charAt(0);
        if (!Character.isLetter(carater)) {
            letra = false;
        }
        int max = getLength() + str.length();

        if (letra) {
            if (max <= tamanho) {
                super.insertString(offs, str, a);
            }
        }
    }
}
