package aulasDevDojo.ExemploEnumeracao;

public enum TipoCliente{

    PESSOA_FISICA(1, "Pessoa Fisica", "CPF"),
    PESSOA_JURIDICA(2, "Pessoa Fisica", "CNPJ"){
        public String gedID(){
            return "Pessoa juridica";
        }
    };

    private int tipo;
    private String nome;
    private String principalDocumento;

    TipoCliente(int tipo, String nome, String principalDocumento){
        this.tipo = tipo;
        this.nome = nome;
        this.principalDocumento = principalDocumento;
    }

    public int getTipo(){
        return this.tipo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getPrincipalDocumento(){
        return this.principalDocumento;
    }

    public String getID(){
        return "A";
    }


}