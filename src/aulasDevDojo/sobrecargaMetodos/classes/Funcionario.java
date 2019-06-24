package aulasDevDojo.sobrecargaMetodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    private double salario;
    private String cargo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getCargo() {
        return this.cargo;
    }


    public Funcionario(String nome, String cpf, String rg, double salario, String cargo){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
        this.cargo = cargo;
    }

    public Funcionario(){

    }

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salário: R$" + this.salario);
        System.out.println("RG: " + this.rg);
        System.out.println("Cargo: " + this.cargo);
    }

}
