package aulasDevDojo.aulaPolimorfismo;

public class RelatorioPagamento {

    public void relatorioPagamamentoGerente(Gerente gerente){
        System.out.println("Gerando relatorio de pagamento para a gaerencia");
        gerente.calculaPagamento();
        System.out.println("Nome: "+gerente.getNome());
        System.out.println("Salário: R$"+gerente.getSalario());
    }

    public void relatorioPagamentoVendedor(Vendedor vendedor){
        System.out.println("Gerando relatorio de pagamento para vendedor");
        vendedor.calculaPagamento();
        System.out.println("Nome: "+vendedor.getNome());
        System.out.println("Salário: R$"+vendedor.getSalario());
    }
}
