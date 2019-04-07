package CursoUdemy.ModuloDois;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);
        char resp;

        do {
            System.out.println("Enter a number");
            double num = leia.nextDouble();
            double raiz = Math.sqrt(num);
            System.out.printf("%.3f\n", raiz);

            System.out.println("Repeat ? Y or N");
            resp = leia.next().charAt(0);
        } while (resp != 'n');

        leia.close();

    }
}
