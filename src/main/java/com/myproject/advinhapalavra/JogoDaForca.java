package com.myproject.advinhapalavra;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import static java.lang.Math.round;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author biancamarques
 */
public class JogoDaForca {
    
    public static final ArrayList<String> lista = new ArrayList<>();
    public static final ArrayList<String> listaAcertos = new ArrayList<>();
    private static String palavraSecreta;

    public void sortearPalavra() {
        try {
            ClassLoader classLoader = JogoDaForca.class.getClassLoader();
            InputStream leitor = classLoader.getResourceAsStream("Lista-de-Palavras.txt");
            Scanner scanner = new Scanner(leitor);
            while(scanner.hasNextLine()){
                String palavra = scanner.nextLine();
                lista.add(palavra);
            }
            Random gerador = new Random();
            int numero = gerador.nextInt(lista.size());
            palavraSecreta = lista.get(numero);
            for(int i = 0; i < palavraSecreta.length(); i++){
                lista.add(String.valueOf(palavraSecreta.charAt(i)));
                listaAcertos.add("_ ");
            }
            leitor.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int definirNumeroTentativas(){
        int tentativas = (int) round(palavraSecreta.length() * 1.3);
        return tentativas;
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public ArrayList<String> getListaAcertos() {
        return listaAcertos;
    }

    public static String getPalavra() {
        String palavra = JogoDaForca.listaAcertos.toString().replace(",", "");
        return palavra;
    }
    
    public static String getPalavraSecreta(){
        return palavraSecreta;
    }
    
    
}
