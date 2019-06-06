package studyUdemy.exercicioFixacaoSection4;

import java.util.Locale;
import java.util.Scanner;

public class BancoApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter account number:  ");
        int accountNumber = leia.nextInt();

        System.out.print("Enter account holder:  ");
        leia.nextLine();
        String nameHolder = leia.nextLine();
        Banco conta;

        System.out.print("Is there an initial deposit ? y/n:  ");
        char resposta = leia.next().charAt(0);

        if (resposta != 'n') {
            System.out.println("Enter the initial deposit at your account");
            double depositoInicial = leia.nextDouble();
            conta = new Banco(accountNumber, nameHolder, depositoInicial);
        }else{
            conta = new Banco(accountNumber, nameHolder);
        }

        System.out.println("Account data:");
        System.out.println(conta+"\n");

        System.out.print("Enter a deposit value: ");
        conta.depositoConta(leia.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(conta+"\n");

        System.out.print("Enter a withdraw value: ");
        conta.saqueConta(leia.nextDouble());
        System.out.println("Updated account data:");
        System.out.println(conta+"\n");

        leia.close();
    }
}
