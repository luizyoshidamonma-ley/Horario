package Composicao.Atv_10;

public class Motor {

    int cilindrada;
    double combustivel;

    public Motor(int cilindrada, double combustivel) {
        this.cilindrada = cilindrada;
        this.combustivel = combustivel;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindrada=" + cilindrada +
                ", combustivel=" + combustivel +
                '}';
    }

    public void ligar() {
    }
}
