package studyUdemy.exercicioFixacaoSection4;

public class Banco {

    private int numeroConta;
    private String nomeTitular;
    private double saldoConta;

    public Banco(int numeroConta, String nomeTitular) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Banco(int numeroConta, String nomeTitular, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoConta = saldoConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void saqueConta(double valorSaque){
        double taxaSaque = 5.00;
        this.saldoConta = this.saldoConta - valorSaque - taxaSaque;
    }

    public void depositoConta(double valorDeposito){
        this.saldoConta = this.saldoConta+ valorDeposito;
    }

    public String toString() {
        return "Account " + numeroConta + " Holder: " + nomeTitular + " Balance: $ " + saldoConta;
    }
}
