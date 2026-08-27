package Composicao.Estudo_3;

public class Personagem {
    String nome;
    int vida;
    Arma weapon;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(){
        weapon = new Arma("Sabor de medo",120);
        System.out.printf("%nConsumir e adaptar%nEu sou uma metamorfose Ambulante%nAdaptar e destruir! *plim plim plom*%n");
        weapon.atacar();
    }
}
