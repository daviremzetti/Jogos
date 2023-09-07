
package com.myproject.advinhapalavra;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author davi_
 */
public class SortearPalavra {

    public static final ArrayList<String> lista = new ArrayList<>();
    public static final ArrayList<String> listaAcertos = new ArrayList<>();
    private static String palavraSecreta;

    public static String executarSorteio() {
        try {
            ClassLoader classLoader = SortearPalavra.class.getClassLoader();
            InputStream leitor = classLoader.getResourceAsStream("Lista-de-Palavras.txt");
            Scanner scanner = new Scanner(leitor);
            while (scanner.hasNextLine()) {
                String palavra = scanner.nextLine();
                lista.add(palavra);
            }
            Random gerador = new Random();
            int numero = gerador.nextInt(lista.size());
            palavraSecreta = lista.get(numero);
            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return palavraSecreta;
    }

}
