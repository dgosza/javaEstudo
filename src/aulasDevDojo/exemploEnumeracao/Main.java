package aulasDevDojo.exemploEnumeracao;

class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Diego", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getID());

    }
}