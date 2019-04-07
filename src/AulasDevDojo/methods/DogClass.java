package AulasDevDojo.methods;

public class DogClass {

    private String nome;
    private String raca;
    private int idade;
    private String estatura;
    private String latido;
    private String andar;

    public DogClass(){
        this.latido = "Au Au";
        this.andar = "Caminhando";
    }

    public String getNome() {
        return nome;
    }
    public String getRaca(){
        return raca;
    }
    public String getLatido(){
        return latido;
    }
    public String getEstatura(){return estatura;}
    public int getIdade() {
        return idade;
    }
    public String getAndar() {
        return andar;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public void setLatido(String latido){
        this.latido = latido;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
    public void setAndar(String andar) {
        this.andar = andar;
    }



}
