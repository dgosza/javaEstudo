package aulasDevDojo.sobrecargaMetodos.test;

import aulasDevDojo.sobrecargaMetodos.classes.Funcionario;

import java.util.Locale;

public class FuncionarioTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);

        Funcionario funcionario = new Funcionario("Diego Magalhães de Souza", "564-000-859-56","00000225-0", 1660.50, "Analista de Helpdesk");
        Funcionario funcionario1 = new Funcionario();

        funcionario.print();
        funcionario1.print();

    }
}
