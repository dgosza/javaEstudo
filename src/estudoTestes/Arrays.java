package estudoTestes;

public class Arrays {
    public static void main(String[] args) {

        //ARRAYS
        //Temos arrays unidimensionais e bidimensionais.
        //Neste arquivo há exemplos de ambos.

        //ARRAYS UNIDIMENSIONAIS
        int[] exemplo1 = new int[5];
        int[] exemplo3 = new int[]{1,2,3,4,5};
        int[] exemplo2 = {1,2,3,4,5};

        //ARRAYS BIDIMENSIONAIS
        //No array bidimensional, a "primeira casa" sera sempre o de referencia.
        //Neste, terá que sempre ter um valor
        int[][] exemploBidimensional0 = new int[0][];
        int[][] exemploBidimensional1 = new int[1][4];
        int[][] exemploBidimensional2 = { {5,9,7,8}, {3,2}, {256,2,9} };

        for(int[] array : exemploBidimensional2){
            System.out.println(array);
            for(int casa : array){
                System.out.println(casa);
            }
        }


        int[][] unidades = new int [4][1];

        unidades[0][0] = 3;
        unidades[1][0] = 5;
        unidades[2][0] = 6;
        unidades[3][0] = 9;

        for(int[] unidade : unidades){
            System.out.println(unidade);
            for(int quantidadeUnidades : unidade){
                System.out.println(quantidadeUnidades);
            }
        }

    }
}
