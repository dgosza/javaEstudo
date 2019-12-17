package revisaoDeConteudo.revisao_polimorfismo;

import revisaoDeConteudo.revisao_heranca.Pessoa;

public class Aluno {

    private String curso;
    private double[] notas;



    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }

    public boolean verificaAprovado(){
        return true;
    }

    public void verificaNaoSei(){
       // nomeVisivel = "dasdas";
    }

}
