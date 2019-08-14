package aulasDevDojo.aulaPolimorfismo;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Gerente gerente = new Gerente("Diego Souza", 5000, 2000);
        Vendedor vendedor = new Vendedor("Mario", 2000, 300);
        RelatorioPagamento relatorio = new RelatorioPagamento();

        //relatorio.relatorioPagamamentoGerente(gerente);
        //System.out.println();
        //relatorio.relatorioPagamentoVendedor(vendedor);

        //polimorfismo
        //Funcionario funcionario = gerente;

        relatorio.relatorioPagamentoGenerico(gerente);
        System.out.println();
        relatorio.relatorioPagamentoGenerico(vendedor);


    }
}
