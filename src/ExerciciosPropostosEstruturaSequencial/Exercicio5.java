package ExerciciosPropostosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int codPeca1;
        int numPecas1;
        double valorUnit1;

        int codPeca2;
        int numPecas2;
        double valorUnit2;


        System.out.println("Digite o código da peça, numero de pecas e o valor unitario - 1");
        codPeca1 = leia.nextInt();
        numPecas1 = leia.nextInt();
        valorUnit1 = leia.nextDouble();

        System.out.println("Digite o código da peça, numero de pecas e o valor unitario - 2");
        codPeca2 = leia.nextInt();
        numPecas2 = leia.nextInt();
        valorUnit2 = leia.nextDouble();

        double total1 = numPecas1 * valorUnit1;
        double total2 = numPecas2 * valorUnit2;

        double total = total1 + total2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

    }
}
