package aulasDevDojo.interface_exercicio.ave;

import aulasDevDojo.interface_exercicio.Animal;

public class Papagaio implements Animal, Ave {

    @Override
    public void getNomeAnimal() {
        System.out.println("PAPAGIO DO BRASIL");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DO PAPAGAIO");
        System.out.println("AAA AA");
    }

    @Override
    public void voar() {
        System.out.println("AVE VOANDO");
    }

}
