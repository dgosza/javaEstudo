package aulasDevDojo.exercicioArrayMultidimensional;

public class Estudante{
    private String nome;
    private int idade;

    public Estudante(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return "Nome: "+this.nome+" Idade: "+this.idade;
    }

}