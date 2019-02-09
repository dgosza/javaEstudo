package ExerciciosEstruturaWhile;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int senha = leia.nextInt();
        while(senha != 2002){
            System.out.println("Senha invalida");
            System.out.println("Digite novamente");
            senha = leia.nextInt();
        }
        System.out.println("Acesso permitido");

        leia.close();


    }
}
