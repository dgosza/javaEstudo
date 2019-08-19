package aulasDevDojo.Assertiva;

public class Main {
    public static void main(String[] args) {
        calculaSalario(-20);
    }

    private static void calculaSalario(double salario){
        assert(salario > 0): "Salario deve ser maior que 0";
    }

}
