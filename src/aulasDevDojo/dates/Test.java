package aulasDevDojo.dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println();

        boolean rep = true;
        Scanner leia = new Scanner(System.in);
        DateVerifica historicopersonal = new DateVerifica();

        do {
            System.out.println("TESTE DE DATE");
            System.out.println(" 1 - Consultar histórico de consultas");
            System.out.println(" 2 - Verificar horario atual");
            int opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    historicopersonal.retornaConsultas();
                    break;
                case 2:
                    historicopersonal.setNumeroDeConsultas(1);
                    historicopersonal.setHistoricoDate();
                    break;
                default:
                    System.out.println("OPCAO ERRADA!");
            }
        } while (rep == true);
    }
}
