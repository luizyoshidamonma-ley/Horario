package Poo1.At4.Atv4Ex3;


public class Veiculo {

    String modelo;
    String marca;
    int velocidade;

    public Veiculo(String modelo, String marca,int velocidade){
        this.modelo = modelo;
        this.marca = marca;
        this.velocidade = velocidade;
    }

    public void acelerar(int aceleracao){

            this.velocidade += aceleracao;
    }

    public void frear (int retardacao){
        if (retardacao > this.velocidade){
            System.out.println("Não é possível retardar mais que a velocidade atual, tente novamente");
        }
        else {
            this.velocidade -= retardacao;
            System.out.println("O carro foi freado");
        }
    }

    public void mostrardados (){
        System.out.printf("O %s de modelo %s está a %d km/h\n",marca,modelo,velocidade);

    }


}

