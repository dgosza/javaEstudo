package Exercicios.ExerciciosEstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int rep = leia.nextInt();

        for (int i = 1; i <= rep; i++) {
            System.out.println("Digite o numero a ser dividido");
            int n1 = leia.nextInt();
            System.out.println("Digite por quanto sera dividido");
            int divisor = leia.nextInt();

            if(divisor == 0){
                System.out.println("Divisao impossivel");
                continue;
            }

            double resto = n1 / divisor;
            System.out.println(resto);

        }

        leia.close();
    }
}
