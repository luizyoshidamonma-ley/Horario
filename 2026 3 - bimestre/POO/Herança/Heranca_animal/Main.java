package Herança.Heranca_animal;

public class Main {
    static void main(String[] args) {
        Cachorro dog = new Cachorro("Warwick",6,80,"Lobisomem");
        Gato cat = new Gato("Rengar",4,70,"Branco");
        Passaro bird = new Passaro("Hawko",10,40,"Gavião");

        System.out.println("----- Cachorro -----");
        dog.mostrardados();
        dog.som();
        System.out.println("----- Gato -----");
        cat.mostrardados();
        cat.som();
        System.out.println("----- Pássaro -----");
        bird.mostrardados();
        bird.som();
    }
}
