package Poo1.At4.Atv4Ex3.Atv4Ex3_gabarito;

public class Main {
    static void main() {
        Veiculo nomeveiculo = new Veiculo("Corolla","Toyota",1);
        nomeveiculo.mostrarDados();
        nomeveiculo.acelerar(10);
        nomeveiculo.mostrarDados();
        nomeveiculo.frear(8);
        nomeveiculo.mostrarDados();
        nomeveiculo.frear(10);
        nomeveiculo.mostrarDados();
    }
}
