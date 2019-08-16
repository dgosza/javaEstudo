package aulasDevDojo.exceptions;

public class RunTimeException {

    public static void main(String[] args) {
        divisao(10,0);
    }

    private static void divisao(int n, int n2) {

        try{
            System.out.println(n / n2);
        }catch (ArithmeticException e){
            System.err.print("ATENCAO: ");
            System.out.println("Número divisor é igual a 0");
            System.out.println("Será atribuido o valor default de valor '2' ");
            System.out.println(n/2);
        }

    }
}
