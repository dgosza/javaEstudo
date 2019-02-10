package ModuloDois;

public class FuncoesEmString {

    public static void main(String[] args) {


        String nome = "Diego Magalhães de Souza abcde ABCDEFG    ";

        String lower = nome.toLowerCase();
        String upper = nome.toUpperCase();  //toda a string em caixa alta
        String trim = nome.trim();          //elimina os espaços contidos na string definida
        String sub = nome.substring(2);     //pega somente a posição 2 em diante
        String sub1 = nome.substring(2, 6);     //imprime da posição 2 ate 6 - predefinido
        String replace = nome.replace('a','A');     //troca a letra predefinida pela desejada
        String replace1 = nome.replace("ABCDE","abc");     //troca a letra predefinida pela desejada
        int i = nome.lastIndexOf("e");                //pega a ultima posição da sintr definida
        int j = nome.indexOf("e");                        //pega a primeira posicao da string definida

        System.out.println(" - "+nome+" - ");
        System.out.println(" - "+lower+" - ");
        System.out.println(" - "+upper+" - ");
        System.out.println(" - "+trim+" - ");
        System.out.println(" - "+sub+" - ");
        System.out.println(" - "+sub1+" - ");
        System.out.println(" - "+replace+" - ");
        System.out.println(" - "+replace1+" - ");
        System.out.println(" - "+i+" - ");
        System.out.println(" - "+j+" - ");

        String testeSplit = "Diego Magalhães de Souza";
        String testeSplit1 = "TrueDetective-Lost-MrRobot-Interstellar";

        String[] split1 = testeSplit.split(" ");   //pega a string definida e corta a mesma em pedaços, de acordo com o a condição ja predefinida. no caaaso o espaço
        String[] split2 = testeSplit1.split("-");  //pega a string definida e corta a mesma em pedaços, de acordo com o a condição ja predefinida. no caaaso o hifen

        System.out.println(split1[0]);
        System.out.println(split1[1]);
        System.out.println(split1[2]);
        System.out.println(split1[3]);

        System.out.println();

        System.out.println(split2[0]);
        System.out.println(split2[1]);
        System.out.println(split2[2]);
        System.out.println(split2[3]);



    }
}
