package aulasDevDojo.sobrecargaContrutores;

import java.util.Locale;

public class EstudanteTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Estudante estudante = new Estudante("Diego Souza", 78946, new double[]{6.80,6.90,8.90}, "01-05-1998");
        estudante.print();

    }
}
