package estudoTestes.polimorfismo;

public class Cachorro extends Mamifero{

    @Override
    public void locomover() {
        System.out.println("Passeando com o Doguinho!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando a fera enjaulada cujo nome é "+getNome());
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public String getCorPelo() {
        return super.getCorPelo();
    }

    @Override
    public void setCorPelo(String corPelo) {
        super.setCorPelo(corPelo);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public int getMembros() {
        return super.getMembros();
    }

    @Override
    public void setMembros(int membros) {
        super.setMembros(membros);
    }
}
