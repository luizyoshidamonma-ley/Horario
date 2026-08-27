package Composicao.Estudo_3;

public class Arma {
    String stringnome;
    int dano;

    public Arma(String stringnome, int dano) {
        this.stringnome = stringnome;
        this.dano = dano;
    }

    public void atacar(){
        System.out.printf("A arma %s deu %d de dano",stringnome,dano);
    }
}
