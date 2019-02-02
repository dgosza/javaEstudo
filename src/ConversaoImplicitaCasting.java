public class ConversaoImplicitaCasting {
    public static void main(String[] args) {

        double a;
        float b;

        a = 5.0;
        b = (float) a;

        System.out.println(b);

        // ===================

        double aa;
        int bb;

        aa = 524.43;
        bb = (int) a;

        System.out.println(bb);

        // ===================

        int n1, n2;
        double resultado;

        n1 = 5;
        n2 = 2;

        resultado = (float) n1/n2;

        System.out.println(resultado);

        // ===================

        int n3;
        double result;
        String number = "243";

        n3 = Integer.parseInt(number);
        System.out.println(number);

        result = Double.parseDouble(number);
        System.out.println(result);


    }
}
