package Exercicios.ExerciciosEstruturaWhile;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int x;
        int y;
        String lado ="";
        System.out.print("X: ");
        x = leia.nextInt();
        System.out.print("Y: ");
        y = leia.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                lado = "Primeiro Quadrante";
            } else if (x > 0 && y < 0) {
                lado = "Quarto Quadrante";
            } else if (x < 0 && y < 0) {
                lado = "Terceiro Quadrante";
            } else if (x < 0 && y > 0) {
                lado = "Segundo Quadrante";
            }

            System.out.println(lado);
            System.out.println();

            System.out.print("X: ");
            x = leia.nextInt();
            System.out.print("Y: ");
            y = leia.nextInt();
        }


        leia.close();

    }
}
