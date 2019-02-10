package ModuloDois;

public class OperadorDeAtribuicao {

    public static void main(String[] args) {


        double numero1 = 10;
        double numero2 = 20;
        String nome = "Diego";

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(nome);
        System.out.println("=================");

        numero1 *=2; //20
        numero2 +=10; //30
        nome += " Souza";

        System.out.println(numero1);
        System.out.println(numero2);
        System.out.println(nome);

        System.out.println("=================");

        int a = 20;
        int b = a++;
        System.out.println("A "+a);
        System.out.println("B "+b);

    }
}
