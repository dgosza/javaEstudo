package ExerciciosEstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int fat = leia.nextInt();
        double fatorial= 1;

        for(int i = 1; i<=fat; i++){

            //System.out.println(i);
            fatorial = i * fatorial;

        }

        System.out.println(fatorial);

        leia.close();

    }
}
