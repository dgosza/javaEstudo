package estudoTestes.polimorfismo;

public class Macaco extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Andando na rua com o "+getNome());
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando o "+getNome()+" com Banana!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Ahhh Ahhh!");
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public int getMembros() {
        return super.getMembros();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public void setMembros(int membros) {
        super.setMembros(membros);
    }

    @Override
    public String getCorPelo() {
        return super.getCorPelo();
    }

    @Override
    public void setCorPelo(String corPelo) {
        super.setCorPelo(corPelo);
    }
}
