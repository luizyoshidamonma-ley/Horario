package Poo1.Atv5Ex6;

public class Temperatura {
    String nomecidade;
    int temperatura;
    String unidademedida;

    public Temperatura(String nomecidade, int temperatura, String unidademedida){
        this.nomecidade = nomecidade;
        this.temperatura = temperatura;
        this.unidademedida = unidademedida;
    }

    public void aumentarTemperatura(int valor){
        this.temperatura += valor;
        System.out.println("A temperatura aumentou!");
    }

    public void diminuirTemperatura(double valor){
        this.temperatura -=valor;
        System.out.println("A temperatura diminuiu!");
    }

    public void mostrarDados(){
        System.out.printf("A cidade %s está a %d %s",nomecidade,temperatura,unidademedida);
    }

    @Override
    public String toString(){
        return "A cidade " +nomecidade+ " está a "+temperatura+" graus "+unidademedida;

    }
}
