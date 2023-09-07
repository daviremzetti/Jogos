package com.myproject.util;

import com.myproject.view.Tela;

/**
 *
 * @author biancamarques
 */
public class ConferirChute {
    
    private String palavraSecreta;
    private Tela tela;

    public boolean conferir(String chute) {
        char chuteChar = chute.charAt(0);
        boolean acertou = false;
        for (int i = 0; i < palavraSecreta.length(); i++) {
            char letra = palavraSecreta.charAt(i);
            if (letra == chuteChar) {
                acertou = true;
            }
        }
        return acertou;
    }
    
    public void setPalavraSecreta(String palavra){
        this.palavraSecreta = palavra;
    }
}
