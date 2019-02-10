package Exercicios.ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("código");
        int cod = leia.nextInt();
        System.out.println("quantidade");
        int quant = leia.nextInt();

        if(cod == 1){
            double preco = 4.00;
            double total = quant * preco;
            System.out.printf("TOTAL %.2f", total);

        }else if(cod == 2){
            double preco = 4.50;
            double total = quant * preco;
            System.out.printf("TOTAL %.2f", total);

        }else if(cod == 3){
            double preco = 5.00;
            double total = quant * preco;
            System.out.printf("TOTAL %.2f", total);

        }else if(cod == 4){
            double preco = 2.00;
            double total = quant * preco;
            System.out.printf("TOTAL %.2f", total);
        }else{
            double preco = 1.50;
            double total = quant * preco;
            System.out.printf("TOTAL %.2f", total);
        }

    }
}
