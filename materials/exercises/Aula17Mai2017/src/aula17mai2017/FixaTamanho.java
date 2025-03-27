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
public class FixaTamanho extends PlainDocument{
    
    public FixaTamanho(int valor){
        super();
        tamanho = valor;
    }
    
    private int tamanho;
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
       
        int max = getLength()+str.length();
        if (max <= tamanho){
            super.insertString(offs, str, a);
        }
    }
}
