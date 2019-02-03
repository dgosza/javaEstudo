package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        System.out.println("enter w a number");
        int n1 = leia.nextInt();
        System.out.println("enter w a number");
        int n2 = leia.nextInt();

        if(n1 % 2 == 0 && n2 % 2 == 0){
            System.out.println("MULTIPLO");
        }else{
            System.out.println("NOT MULTIPLO");
        }

    }
}
