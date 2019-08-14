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

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatorio de pagamento");
        funcionario.calculaPagamento();
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Salário: R$"+funcionario.getSalario());
        if(funcionario instanceof Gerente){
            Gerente gerente = (Gerente) funcionario;
            System.out.println("PNL: "+gerente.getPnl());
        }
        if(funcionario instanceof Vendedor){
            Vendedor vendedor = (Vendedor) funcionario;
            System.out.println("Total vendas: "+vendedor.getTotalVendas());
        }
    }
}
