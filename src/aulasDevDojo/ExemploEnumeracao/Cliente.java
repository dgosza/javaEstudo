package aulasDevDojo.ExemploEnumeracao;

public class Cliente{

    public enum TipoPagamento {
        DEBITO, CREDITO, BOLETO_BANCARIO, CHEQUE;
    }
    private String nome;
    private TipoCliente cliente;
    private TipoPagamento pagamento;

    public Cliente() {

    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, TipoCliente cliente, TipoPagamento pagamento) {
        this.nome = nome;
        this.cliente = cliente;
        this.pagamento = pagamento;
    }

    @Override
    public String toString() {
        return "Nome: "+this.nome+
                ". Tipo de Cliente: "+this.cliente.getNome()+
                ". Tipo de PAGAMENTO: "+this.pagamento+
                ". Numero: "+this.cliente.getTipo()+
                ". Principal Documento: "+this.cliente.getPrincipalDocumento();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getCliente() {
        return cliente;
    }

    public void setCliente(TipoCliente cliente) {
        this.cliente = cliente;
    }

    public void setPagamento(TipoPagamento pagamento){
        this.pagamento = pagamento;
    }

    public TipoPagamento getPagamento(){
        return this.pagamento;
    }

}