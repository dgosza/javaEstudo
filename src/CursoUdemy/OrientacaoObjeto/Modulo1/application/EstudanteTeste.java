package CursoUdemy.OrientacaoObjeto.Modulo1.application;

import CursoUdemy.OrientacaoObjeto.Modulo1.entities.Estudante;

import java.util.Locale;

public class EstudanteTeste {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Estudante diego = new Estudante();

        diego.nome = "Diego";
        diego.altura = 1.70;
        diego.idade = 19;
        diego.sobrenome = "Souza";

        diego.exibe();

        System.out.println(diego.retornaNome());


    }
}
