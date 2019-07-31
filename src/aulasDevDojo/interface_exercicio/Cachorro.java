package aulasDevDojo.interface_exercicio.mamifero;

import aulasDevDojo.interface_exercicio.Animal;

public class Cachorro implements Animal, Mamifero {

    private String tamanho;
    private String raca;

    @Override
    public void getNomeAnimal() {
        System.out.println("CACHORRO BEAGLE");
    }

    @Override
    public void emitirSom() {
        System.out.println("SOM DO CACHORRO");
        System.out.println("AU AU AU");
    }

    @Override
    public void amamentar() {
        System.out.println("AMAMENTANDO O CACHORRO");
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
