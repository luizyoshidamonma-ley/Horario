package Composicao.Atv_10;

public class Carro {
    private Motor motor;

    public Carro(int cilindrada, double combustivel){
        motor = new Motor(cilindrada,combustivel);


    }

    void ligarCarro(){
        motor.ligar();
        System.out.println("Carro ligado");
    }
    void mostrarDados(){
        System.out.println(motor);
    }
}
