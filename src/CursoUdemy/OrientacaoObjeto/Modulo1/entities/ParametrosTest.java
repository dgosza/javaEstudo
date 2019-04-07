package CursoUdemy.OrientacaoObjeto.Modulo1.entities;

public class ParametrosTest {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int n1 = 5;
        int n2 = 10;

        calc.alteraDoisNumeros(n1, n2);


        System.out.println("Dentro do teste");
        System.out.println("num1 = "+ n1);
        System.out.println("num1 = "+ n2);

    }
}
