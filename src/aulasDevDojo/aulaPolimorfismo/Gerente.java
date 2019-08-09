package aulasDevDojo.aulaPolimorfismo;

public class Gerente extends Funcionario {

    private double pnl;

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public void calculaPagamento() {
        this.salario = this.salario * pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
