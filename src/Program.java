import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos numeros vc ira digitar ?");
        int nInteiro = leia.nextInt();
        int soma = 0;

        for(int i = 1; i<=nInteiro; i++){
            System.out.println("Digite o valor #"+i);
            int x = leia.nextInt();
            soma += x;
        }

        System.out.println(soma);

        leia.close();

    }
}
