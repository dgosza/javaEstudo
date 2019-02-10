package Exercicios.ExerciciosEstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);
        double media1 = 0.00;
        double media2 = 0.00;
        double media3 = 0.00;

        int rep = leia.nextInt();
        for (int i = 1; i <= rep; i++) {
            System.out.println("Digite o 1 numero");
            double n1 = leia.nextDouble();
            System.out.println("Digite o 2 numero");
            double n2 = leia.nextDouble();
            System.out.println("Digite o 3 numero");
            double n3 = leia.nextDouble();

            switch (i) {
                case 1:
                    media1 = calculaMedia(n1, n2, n3);
                    break;
                case 2:
                    media2 = calculaMedia(n1, n2, n3);
                    break;
                case 3:
                    media3 = calculaMedia(n1, n2, n3);
                    break;
            }
        }

        System.out.printf("%.1f", media1);
        System.out.printf("%.1f", media2);
        System.out.printf("%.1f", media3);

        leia.close();
    }

    public static double calculaMedia(double a, double b, double c) {
        double media = (a * 2 + b * 3 + c * 5) / 10;
        return media;
    }
}
