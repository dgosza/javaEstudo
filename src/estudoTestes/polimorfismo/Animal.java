package estudoTestes.polimorfismo;

public interface Animal {

    //GETTERS
    String getNome();
    int getIdade();
    int getMembros();

    //SETTERS
    void setNome(String nome);
    void setIdade(int idade);
    void setMembros(int membros);

    //METHODS
    void locomover();
    void alimentar();
    void emitirSom();

}
