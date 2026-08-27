package Poo1.At4.Atv4Ex3.Atv4Ex3_gabarito;

public class Veiculo {
    String modelo;
    String marca;
    int velocidade;

    public Veiculo (String modelo, String marca, int velocidade){
        this.modelo = modelo;
        this.marca = marca;
        if (velocidade >=0){
            this.velocidade = velocidade;
        }else{
            this.velocidade = 0;
            System.out.println("O valor é negativo, automaticamente definido como 0");
        }

    }

    public void acelerar(int valor){
        if(valor >= 0){
            velocidade += velocidade + valor;
            System.out.println("O veículo acelerou "+valor+" km/h e está a "+velocidade+"km/h");
        }else {
            System.out.println("Inválido! valor é negativo");
        }
    }

    public void frear(int valor){
        if (valor <= 0){
            System.out.println("O valor para frear deve ser positivo!");
        }else{
            if (valor <= velocidade){
                velocidade -= valor;
                System.out.println("O veículo reduziu sua velocidade em "+valor+" km/h e agora está a "+velocidade+" kmh/");
            }
        }
    }

    public void mostrarDados(){
        System.out.println();
        System.out.println("=== Dados do Veículo ===");
        System.out.println("Marca: "+ marca );
        System.out.println("Modelo: "+ modelo );
        System.out.println("Velocidade atual: "+ velocidade );
    }

}


