package Exercicios.ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("digite um numero");
        double num = leia.nextDouble();

        if(num<0){
            System.out.println("Fora do intervalo");
        }
        else if(num <=25.00){
            System.out.println("Intervalo [0,25]");
        }else if(num <=50.00){
            System.out.println("Intervalo [25,50]");
        }else if(num<=75.00){
            System.out.println("Intervalo [50,75]");
        }else if(num <=100.00){
            System.out.println("Intervalo [75,100]");
        }

    }
}
