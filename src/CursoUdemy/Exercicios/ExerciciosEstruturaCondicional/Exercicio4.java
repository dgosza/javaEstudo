package CursoUdemy.Exercicios.ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        int duracao;
        Scanner leia = new Scanner(System.in);

        System.out.println("Hora inicial");
        int inicioJogo = leia.nextInt();
        System.out.println("Hora final");
        int finalJogo = leia.nextInt();

        leia.close();

        if(inicioJogo<finalJogo){
            duracao = finalJogo - inicioJogo;
        }else{
            duracao = 24 - inicioJogo + finalJogo;
        }

        System.out.println("O JOGO DUROU "+duracao+" horas");


    }
}
