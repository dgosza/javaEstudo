package aulasDevDojo.exceptions.exemplo1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String frase = null;
        String fraseNova = null;

        try {
            fraseNova = frase.toUpperCase();
        } catch (NullPointerException e) {
            System.out.println("O frase inicial está nula, para solucionar tal o problema, foi lhe atribuito um valor.");
            frase = "Frase vazia";
            fraseNova = frase.toUpperCase();
        }

    }
}
