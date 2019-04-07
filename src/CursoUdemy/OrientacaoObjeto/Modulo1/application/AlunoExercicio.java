package CursoUdemy.OrientacaoObjeto.Modulo1.application;

import CursoUdemy.OrientacaoObjeto.Modulo1.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class AlunoExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);
        Aluno diego = new Aluno();

        System.out.println("Escreva o nome do aluno");
        diego.nomeAluno = leia.next();

        System.out.println("Escreva a nota 1");
        diego.nota1 = leia.nextDouble();

        System.out.println("Escreva a nota 2");
        diego.nota2 = leia.nextDouble();

        System.out.println("Escreva a nota 3");
        diego.nota3 = leia.nextDouble();

        System.out.println(diego);
        if(60.00 < diego.calculaNota()){
            System.out.println("FAILED");
            System.out.print("MISSING");
            System.out.print(diego.calculaNota() - 60.00);
        }else{
            System.out.println("PASS");
        }



        leia.close();
    }
}
