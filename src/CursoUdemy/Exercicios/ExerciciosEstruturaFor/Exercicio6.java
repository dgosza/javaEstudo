package CursoUdemy.Exercicios.ExerciciosEstruturaFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int num = leia.nextInt();

        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }

        leia.close();
    }
}
