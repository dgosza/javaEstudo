package OrientacaoObjeto.Modulo1.application;

import OrientacaoObjeto.Modulo1.entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner leia = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();

        System.out.println("Enter rectangle widht and height");
        retangulo.width = leia.nextDouble();
        retangulo.height = leia.nextDouble();

        System.out.println(retangulo);

        leia.close();
    }
}
