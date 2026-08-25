package Herança.Heranca_animal;

public class Gato extends Animal{
    private String cor;

    public Gato(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void som(){
        System.out.println("Miau, Miau");
    }

    @Override
    public void mostrardados() {
        super.mostrardados();
        System.out.println("Cor: "+cor);
    }
}
