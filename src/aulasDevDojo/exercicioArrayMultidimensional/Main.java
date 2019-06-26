package aulasDevDojo.exercicioArrayMultidimensional;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        Estudante[][] estudante = new Estudante[4][10];
        System.out.println("Digite quantos estudantes irá ser cadastrado");
        int numAlunos = leia.nextInt();
        int numArray = 0;

        for(int i = 1; i<=numAlunos; i++){
            System.out.print(" Digite o nome do aluno: ");
            String nome = leia.next();
            System.out.print (" Digite a idade do estudante: ");
            int idade = leia.nextInt();
            System.out.println(" Sala 0 - Análise e Desenvolvimento de Sistemas");
            System.out.println(" Sala 1 - Administração");
            System.out.println(" Sala 2 - Engenharia da Computação");
            System.out.println(" Sala 3 - Engenharia de Software");
            System.out.print("Digite o numero da sala de acordo com o curso desejado: ");
            int numSala = leia.nextInt();

            for(int j = 0; j<=5; j++){
                if(estudante[numSala][j] == null){
                    numArray = j;
                    break;
                }
            }
            estudante[numSala][numArray] = new Estudante(nome, idade);
        }

        for(Estudante[] sala : estudante){
            System.out.println(sala);
            for(Estudante aluno : sala){
                System.out.println(aluno);
            }
        }

        leia.close();
    }
}