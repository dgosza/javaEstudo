package aulasDevDojo.aulaPolimorfismo;

public class DatabaseDAO implements DAO {

    @Override
    public void save() {
        System.out.println("Salva no banco de dados");
    }
}
