package studyUdemy.application;

import studyUdemy.methods.ExercicioDollar;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDollarApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.println("What is the dollar price ?");
        double dolar = leia.nextDouble();

        System.out.println("How many dollars will be bought?");
        double dolarBought = leia.nextDouble();

        double totalDollar = dolar * dolarBought;
        double imposto = ExercicioDollar.iofPorcentagem(totalDollar);

        System.out.printf("Amount to be paid in reais = %.2f", totalDollar + imposto );

        leia.close();
    }
}
