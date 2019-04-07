package CursoUdemy.Exercicios.ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);
        System.out.println("enter w a integer number");
        int n1 = leia.nextInt();

        if(n1<0){
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }

    }
}
