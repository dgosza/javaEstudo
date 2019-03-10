package OrientacaoObjeto.Modulo1.application;

import OrientacaoObjeto.Modulo1.entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);
        Funcionario diego = new Funcionario();
        char rep;
        do{
            System.out.print("Name: ");
            diego.nomeFunc = leia.next();

            System.out.print("Gross Salary: ");
            diego.salarioFunc = leia.nextDouble();

            System.out.print("Tax: ");
            diego.taxa = leia.nextDouble();

            System.out.println("Employee: "+diego.nomeFunc+" $ "+diego.liquidoSalario());
            System.out.print("Which percentage to increase salary?");
            double tax = leia.nextDouble();
            diego.proxSalario(tax);

            System.out.println(diego);
            System.out.println();

            System.out.println("Repetir ? Y or N");
            rep = leia.next().charAt(0);

        }while(rep !='n');

        leia.close();
    }
}
