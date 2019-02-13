package OrientacaoObjeto.application;

import OrientacaoObjeto.entities.Professor;

import java.util.Scanner;

public class ProfessorPreenche {

    public static void main(String[] args) {

        Professor professor = new Professor();
        Professor professor1 = new Professor();
        Scanner leia = new Scanner(System.in);

        System.out.println("Entre com o nome do professor");
        professor.nome = leia.next();

        System.out.println("Entre com a CPF");
        professor.cpf = leia.nextInt();

        System.out.println("Entre com o RG");
        professor1.rg = leia.nextInt();

        System.out.println("Entre com o nome do professor");
        professor1.nome = leia.next();

        System.out.println("Entre com a CPF");
        professor1.cpf = leia.nextInt();

        System.out.println("Entre com o RG");
        professor1 .rg = leia.nextInt();

        professor.mostraDados();
        professor1.mostraDados();

    }


}
