package OrientacaoObjeto.application;

import OrientacaoObjeto.entities.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        cal.somaDoisNumeros();
        cal.subtraiNumber();

        //without return
        cal.multiplicaNumero(5,10);

        //with return
        cal.divideDoisNumeros(20,2);


    }
}
