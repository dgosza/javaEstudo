package OrientacaoObjeto.Modulo1.application;

import OrientacaoObjeto.Modulo1.entities.Professor;

import java.util.Locale;

public class ProfessorTeste {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        Professor prof  = new Professor();
        Professor prof1  = new Professor();

        prof.nome = "Diego";
        prof.rg = 250723880;
        prof.cpf = "40671027808";
        prof.matricula = 1710022323;

        prof1.nome = "Ronaldo";
        prof1.rg = 250723880;
        prof1.cpf = "40671027808";
        prof1.matricula = 1710022323;


        prof.imprimeDados();

        prof1.imprimeDados();


    }
}
