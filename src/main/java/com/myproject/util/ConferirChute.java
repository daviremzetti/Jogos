package com.myproject.util;

import com.myproject.advinhapalavra.JogoDaForca;

/**
 *
 * @author biancamarques
 */
public class ConferirChute {

    public static void conferir(String chute) {
        char chuteChar = chute.charAt(0);
        for (int i = 0; i < JogoDaForca.getPalavraSecreta().length(); i++) {
            char letra = JogoDaForca.getPalavraSecreta().charAt(i);
            if (letra == chuteChar) {
                JogoDaForca.listaAcertos.set(i, chute);
            }
        }
    }
}
