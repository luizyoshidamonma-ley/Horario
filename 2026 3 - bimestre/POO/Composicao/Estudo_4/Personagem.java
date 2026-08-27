package Composicao.Estudo_4;

public class Personagem {
    Arma arma;
    String nome;
    int vida;

    public Personagem(String nome, int vida) {
        arma = new Arma("Manopola de Horox",200);
        this.nome = nome;
        this.vida = vida;
    }

    public void personagemAtacar(){
        System.out.printf("%nO personagem %s tem %d de vida%n",nome,vida);
        arma.armaAtacar();
    }
}
