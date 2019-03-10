package Exercicios.ExercicioFixacao;

import java.util.Locale;
import java.util.Scanner;

public class LerCotacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("Whats is the dollar price?");
        double priceDollar = leia.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dollarBought = leia.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.converteDollar(dollarBought, priceDollar));


    }
}
