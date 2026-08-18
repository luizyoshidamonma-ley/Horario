package Herança.Heranca_animal;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void som(){
        System.out.println("Auuuuu, baby I'm gonna prey on you tonight");
    }

    @Override
    public void mostrardados() {
        super.mostrardados();
        System.out.println("Raça: "+raca);
    }
}
