package org.example;

public class EroeNonIdoneo extends Exception{
    public final String NomeEroe;
    public final int LivelloEroe;
    public EroeNonIdoneo(String message, String nomeEroe, int livelloEroe){
        super(message);
        NomeEroe = nomeEroe;
        LivelloEroe = livelloEroe;
    }
}
