package aulasDevDojo.aulaPolimorfismo;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Diego Souza", 200, 2000);
        Vendedor vendedor = new Vendedor("Mario", 200, 300);
        RelatorioPagamento relatorio = new RelatorioPagamento();

        relatorio.relatorioPagamamentoGerente(gerente);
        System.out.println();
        relatorio.relatorioPagamentoVendedor(vendedor);

        //polimorfismo
        Funcionario funcionario = gerente;
        System.out.println();
        System.out.println(funcionario.getSalario());
    }
}
