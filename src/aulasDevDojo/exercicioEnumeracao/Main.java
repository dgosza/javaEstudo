package aulasDevDojo.exercicioEnumeracao;

class Main {
    public static void main(String[] args) {

        Pessoa diego = new Pessoa("Diego", 19, TipoSanguineo.B);

        System.out.println(diego);
        System.out.println(TipoSanguineo.AB.getAntiCorposPossui());
    }
}