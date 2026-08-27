package Composicao.Estudo_2;

public class Human {
    String nome;
    Cachorro dog;

    public Human(String nome) {
        this.nome = nome;
        dog = new Cachorro("Bristle","Porco");
    }

    public void mostrarHumano(){
        System.out.println("humano nojeto"+nome);
        dog.mostrarCachorro();
    }
}
