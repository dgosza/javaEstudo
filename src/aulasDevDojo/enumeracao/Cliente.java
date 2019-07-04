package aulasDevDojo.enumeracao;

public class Cliente {

    private String nome;
    public static final int PESSOA_FISICA = 1;
    public static final int PESSOA_JURIDICA = 2;
    private int tipo;

    public Cliente() {

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String tipo_aux;
        tipo_aux = (this.tipo == 1)? "Pessoa Fisica" : "Pessoa Juridica";

        return "Nome: " + this.nome + ". Tipo de Cliente: " + tipo_aux;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }


}
