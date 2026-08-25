package Herança.Heranca_animal;

public class Passaro extends Animal{
    private String especie;

    public Passaro(String nome, int idade, double peso, String especie) {
        super(nome, idade, peso);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void som(){
        System.out.println("Hawk Out!");
    }

    @Override
    public void mostrardados() {
        super.mostrardados();
        System.out.println("Espécie: "+especie);
    }
}
