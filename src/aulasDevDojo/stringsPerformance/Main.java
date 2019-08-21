package aulasDevDojo.stringsPerformance;

public class Main {
    public static void main(String[] args) {

        long tempo = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: "+ (fim - tempo));

        tempo = System.currentTimeMillis();
        concatStringBuilder(500000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto no Builder  : "+ (fim - tempo));

        tempo = System.currentTimeMillis();
        concatStringBuffer(500000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto no Buffer  : "+ (fim - tempo));
    }

    private static void concatString(int tam){
        String string = "";
        for(int i = 0; i<tam; i++){
            string += i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder string = new StringBuilder(tam);
        for(int i = 0; i<tam; i++){
            string.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer string = new StringBuffer(tam);
        for(int i = 0; i<tam; i++){
            string.append(i);
        }
    }
}
