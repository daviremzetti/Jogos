
package com.myproject.advinhapalavra;

import static java.lang.Math.round;

/**
 *
 * @author davi_
 */
public class DefinirTentativas {
    
     public static int definirNumeroTentativas(String palavraSecreta){
        int tentativas = (int) round(palavraSecreta.length() * 1.3);
        return tentativas;
    }
    
}
