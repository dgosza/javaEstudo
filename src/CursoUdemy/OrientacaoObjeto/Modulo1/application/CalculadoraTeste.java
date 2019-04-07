package CursoUdemy.OrientacaoObjeto.Modulo1.application;

import CursoUdemy.OrientacaoObjeto.Modulo1.entities.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        cal.somaDoisNumeros();
        cal.subtraiNumber();

        //without return
        cal.multiplicaNumero(5,10);

        //with return
        System.out.println(cal.divideDoisNumeros(89,4));


        int [] numeros = new int []{1,2,3,4,5,6};

        cal.somaArray(numeros);


    }
}
