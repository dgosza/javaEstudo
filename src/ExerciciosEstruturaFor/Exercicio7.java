package ExerciciosEstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int n1 = leia.nextInt();

        for(int i = 1; i<=n1; i++){
            int proprio = i;
            int quadrado = i*i;
            int cubo = i*i*i;

            System.out.print(proprio+" "+quadrado+" "+cubo+"\n");

        }

        leia.close();
    }
}
