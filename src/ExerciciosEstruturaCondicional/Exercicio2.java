package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        System.out.println("enter w a integer number");
        int n1 = leia.nextInt();

        if(n1 % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }

    }
}
