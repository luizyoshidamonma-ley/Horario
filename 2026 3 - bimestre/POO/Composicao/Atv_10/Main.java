package Composicao.Atv_10;

public class Main {
    static void main() {
        Carro carro = new Carro(6,40);
        Carro carro1 = new Carro(4,50);
        carro.ligarCarro();
        carro.mostrarDados();
        carro1.mostrarDados();
    }
}
