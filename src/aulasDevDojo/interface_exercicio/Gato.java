package aulasDevDojo.interface_exercicio.mamifero;

import aulasDevDojo.interface_exercicio.Animal;

public class Gato implements Animal, Mamifero {

    private String raca;

    @Override
    public void getNomeAnimal() {
        System.out.println("GATO Siamês");
    }

    @Override
    public void emitirSom() {
        System.out.println("BARULHO DO GATO SIAMES");
        System.out.println("MIAAAAAU");
    }

    @Override
    public void amamentar() {
        System.out.println("GATO SENDO AMAMENTADO");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
