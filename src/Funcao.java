import java.util.Scanner;

public class Funcao {

    public static void main(String[] args) {


        Scanner leia = new Scanner(System.in);

        System.out.println("digite 3 numeros");
        int n1 = leia.nextInt();
        int n2 = leia.nextInt();
        int n3 = leia.nextInt();

        int maior = max(n1, n1, n3);
        showResult(maior);

        leia.close();

    }

    public static int max(int x, int y, int z) {
        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;

    }

    public static void showResult(int valorMaximo){
        System.out.println("Valor Maximo "+valorMaximo);
    }

}
