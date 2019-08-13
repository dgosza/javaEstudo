package estudoTestes.polimorfismo;

public class Nemo extends Peixe {
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
    public void locomover() {
        System.out.println("Nadando!!!");
    }

    @Override
    public void alimentar() {
        System.out.println("Alimentando o "+getNome()+" com sementes para peixe!!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Glu Glu Glu....");
    }

    @Override
    public String getCorEscama() {
        return super.getCorEscama();
    }

    @Override
    public void setCorEscama(String corEscama) {
        super.setCorEscama(corEscama);
    }
}
