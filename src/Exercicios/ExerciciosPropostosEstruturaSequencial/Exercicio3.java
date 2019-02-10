package Exercicios.ExerciciosPropostosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int a, b, c, d, dif;

        System.out.println("Escreva o 1 numero");
        a = leia.nextInt();

        System.out.println("Escreva o 2 numero");
        b = leia.nextInt();

        System.out.println("Escreva o 3 numero");
        c = leia.nextInt();

        System.out.println("Escreva o 4 numero");
        d = leia.nextInt();

        dif = (a*b - c*d);
        System.out.println("Diferença"+dif);

    }
}
