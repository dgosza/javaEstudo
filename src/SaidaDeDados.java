import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args) {


        char gender = 'm';
        int age = 19;
        String name = "Diego Souza";
        double balance = 10.32034;

        System.out.printf("%.2f%n", balance);
        System.out.printf("%.4f%n", balance);


        Locale.setDefault(Locale.ENGLISH);
        System.out.printf("%.4f%n", balance);


        System.out.println("=======================");

        System.out.printf("%s is %d years old, gender %c and got balance = %.2f", name, age, gender, balance);

    }
}
