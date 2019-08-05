package aulasDevDojo.interface_exercicio;

import aulasDevDojo.interface_exercicio.ave.Papagaio;
import aulasDevDojo.interface_exercicio.mamifero.Cachorro;
import aulasDevDojo.interface_exercicio.mamifero.Gato;

public class Main {
    public static void main(String[] args) {

        Cachorro dog = new Cachorro();
        Gato cat = new Gato();
        Papagaio ave = new Papagaio();

        System.out.println("AÇOES CACHORRO");
        dog.getNomeAnimal();
        dog.getRaca();
        System.out.println("teste");
        dog.getTamanho();
        dog.emitirSom();
        dog.amamentar();

        System.out.println();

        System.out.println("AÇOES AVE");
        ave.emitirSom();
        ave.voar();
        ave.getNomeAnimal();

        System.out.println();

        System.out.println("AÇÔES GATO");
        cat.amamentar();
        cat.emitirSom();
        cat.getNomeAnimal();
        cat.getRaca();
    }
}
