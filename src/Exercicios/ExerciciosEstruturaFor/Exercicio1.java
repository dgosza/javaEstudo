package Exercicios.ExerciciosEstruturaFor;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int n1 = 0;
        n1 = leia.nextInt();

        for(int i = 1; i<= n1; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }


    }
}
