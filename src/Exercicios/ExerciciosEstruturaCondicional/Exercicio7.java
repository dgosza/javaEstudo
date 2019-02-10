package Exercicios.ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o x");
        double x = leia.nextDouble();
        System.out.println("Digite o y");
        double y = leia.nextDouble();

        if(x==0.00 & y == 0.00){
            System.out.println("Origem");
        }else if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x > 0 && y <0){
            System.out.println("Q4");
        }else if(x<0 && y>0){
            System.out.println("Q2");
        }else if(x<0 && y<0){
            System.out.println("Q3");
        }

    }
}
