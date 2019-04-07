package CursoUdemy.Exercicios.ExerciciosPropostosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        int codFunc;
        int horasTrab;
        double recebePorHora;
        double salario;

        System.out.println("Digite o código do funcionario, numero de horas trabalhadas e o valor por hora.");
        codFunc = leia.nextInt();
        horasTrab = leia.nextInt();
        recebePorHora = leia.nextDouble();

        salario = horasTrab * recebePorHora;

        System.out.println("NUMBER = "+25);
        System.out.printf("SALARY = U$ %.2f", salario);



    }
}
