package aulasDevDojo.aulaPolimorfismo;

public class DAOTest {
    public static void main(String[] args) {
        System.out.println();

        DAO arquivoDAO = new DatabaseDAO();
        arquivoDAO.save();
    }
}
