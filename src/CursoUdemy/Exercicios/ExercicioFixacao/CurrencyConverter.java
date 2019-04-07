package CursoUdemy.Exercicios.ExercicioFixacao;

public class CurrencyConverter {

    public static double converteDollar(double dollarComprados, double priceDollar){

        double semJuros = dollarComprados * priceDollar;
        return semJuros += semJuros * 0.06;
    }

}
