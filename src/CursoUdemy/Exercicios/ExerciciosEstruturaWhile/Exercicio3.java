package CursoUdemy.Exercicios.ExerciciosEstruturaWhile;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int cod1 = 0;
        int cod2 = 0;
        int cod3 = 0;

        System.out.println("Informe o código do combustivel");
        int codigo = leia.nextInt();

        while (codigo != 4) {
            switch (codigo) {
                case 1:
                    cod1 += 1;
                    break;
                case 2:
                    cod2 += 1;
                    break;
                case 3:
                    cod3 += 1;
                    break;
            }

            System.out.println("Informe o código do combustivel");
            codigo = leia.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+cod1);
        System.out.println("Gasolina: "+cod2);
        System.out.println("Diesel: "+cod3);

        leia.close();

    }
}
