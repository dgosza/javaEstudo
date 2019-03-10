package OrientacaoObjeto.Modulo1.application;

import OrientacaoObjeto.Modulo1.entities.Carro;

public class TesteCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.placa = "3131-abc";
        carro.modelo = "BMW";
        carro.velocidadeMaxima = 200;


        System.out.println(carro.placa);


    }
}
