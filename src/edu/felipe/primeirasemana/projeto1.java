package edu.felipe.primeirasemana;

public class projeto1 {
    public static void main (String [] args) {
        String nomeDoZe = "Zézera";
        String sobrenomeDoZe = "Consultor da TUPAN";
        String zezera = zezera(nomeDoZe, sobrenomeDoZe);

        System.out.println(zezera);
    }
    public static String zezera (String nomeDoZe, String sobrenomeDoZe){
        return nomeDoZe.concat(" ").concat(sobrenomeDoZe);
    }
}