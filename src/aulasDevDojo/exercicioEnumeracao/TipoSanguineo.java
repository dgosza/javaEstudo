package aulasDevDojo.exercicioEnumeracao;

public enum TipoSanguineo{

    A("A", "A", "Anti B", "Anti A"),
    B("B", "B", "Anti A", "Anti B"),
    AB("AB", "A e B", "", "Anti A e Anti B"){
        public String getAntiCorposPossui(){
            return "Não possui pois bla blabla";
        }
    },
    O("O", "Nenhum", "Anti A e Anti B", "");

    private String grupoSanguineo;
    private String antigenoABO;
    private String antiCorposPossui;
    private String antiCorposNaoPossui;

    public String toString(){
        return "Grupo Sanguineo: "+this.grupoSanguineo+
                "\n. Antígeno do sistema ABO: "+this.antigenoABO+
                "\n. Anticorpos que podem possuir: "+this.antiCorposPossui+
                "\n. Anticorpos que não podem possuir"+this.antiCorposNaoPossui;
    }

    TipoSanguineo(String grupoSanguineo, String antigenoABO, String antiCorposPossui, String antiCorposNaoPossui){
        this.grupoSanguineo = grupoSanguineo;
        this.antigenoABO = antigenoABO;
        this.antiCorposPossui = antiCorposPossui;
        this.antiCorposNaoPossui = antiCorposNaoPossui;
    }

    public String getAntiCorposPossui(){
        return this.antiCorposPossui;
    }

}