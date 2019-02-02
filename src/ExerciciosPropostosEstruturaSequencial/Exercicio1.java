package ExerciciosPropostosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Escreva o primeiro numero ");
        int n1 = leia.nextInt();

        System.out.print("Escreva o segundo numero ");
        int n2 = leia.nextInt();

        int soma = n1 + n2;
        System.out.println(soma);

    }
}
