package studyUdemy.exercicioFixacaoVetor;

public class Quarto {
    private String nome;
    private String email;

    public Quarto(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome+", "+email;
    }
}
