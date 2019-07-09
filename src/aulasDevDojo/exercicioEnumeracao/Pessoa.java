package aulasDevDojo.exercicioEnumeracao;

public class Pessoa{

    private String nome;
    private int idade;
    public TipoSanguineo tipoSangue;

    public Pessoa(String nome, int idade, TipoSanguineo tipoSangue){
        this.nome = nome;
        this.idade = idade;
        this.tipoSangue = tipoSangue;
    }

    public String toString(){
        return "\n\n"+
                "Nome do Paciente: "+this.nome+
                "\nIdade: "+this.idade+
                "\n"+
                //grupo sanguineo
                this.tipoSangue ;
    }





}