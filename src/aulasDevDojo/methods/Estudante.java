package aulasDevDojo.methods;

import aulasDevDojo.Program.EstudanteMethod;

import java.util.Locale;
import java.util.Scanner;

public class Estudante {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);
        EstudanteMethod estudante = new EstudanteMethod();

        estudante.setNome("Diego MAgalhães");
        estudante.setIdade(17);
        estudante.setNotas(new double[]{4, 2, 10, 2});

        estudante.print();
        estudante.retornaMedia();

        leia.close();
    }
}
