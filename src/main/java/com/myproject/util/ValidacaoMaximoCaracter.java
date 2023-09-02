
package com.myproject.util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author biancamarques
 */
public class ValidacaoMaximoCaracter extends PlainDocument {
    
    private int limite;

    public ValidacaoMaximoCaracter(int limite) {
        super();
        this.limite = limite;
    }
    
    public void insertString(int ofs, String str, AttributeSet a) throws BadLocationException{
        if(getLength() + str.length() <= limite){
            super.insertString(ofs, str, a);
        }
    }
    
}
