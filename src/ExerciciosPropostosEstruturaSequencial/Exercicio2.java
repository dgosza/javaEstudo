package ExerciciosPropostosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        double pi = 3.14159;

        System.out.print("Escreva o valor do raio");
        double raio = leia.nextDouble();
        raio *= raio;
        double result = pi * raio;

        System.out.printf("Valor da área: %.4f", result);


    }
}
