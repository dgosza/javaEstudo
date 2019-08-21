package aulasDevDojo.stringBuilderBuffer;

public class StringBuilder {
    public static void main(String[] args) {

        String s = "teste";
        java.lang.StringBuilder sb = new java.lang.StringBuilder(16);
        sb.append(" oh shit");

        System.out.println(sb.insert(2, "OH SHIT"));

    }
}
