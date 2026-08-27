package Composicao.Estudo_4;

public class Arma {
    String nome;
    int dano;

    public Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public void armaAtacar(){
        System.out.printf("%nA arma %s deu %d de dano%n",nome,dano);
    }
}
