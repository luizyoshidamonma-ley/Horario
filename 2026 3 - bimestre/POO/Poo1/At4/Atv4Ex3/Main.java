package Poo1.At4.Atv4Ex3;
// \n

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Qual modelo do carro? (Exemplo: Corolla)");
        String modelo = sc.nextLine();
        System.out.println("Qual marca do carro? (Exemplo: Toyota)");
        String marca = sc.nextLine();

        System.out.println("Qual a velocidade inicial do carro? (em km/h, números inteiros)");
        int velocidade = sc.nextInt();
        while (velocidade < 0) {
            if (velocidade < 0) {
                System.out.println("Por favor digite um número válido (maior ou igual que 0) ");
                velocidade = sc.nextInt();
            }

        }


        Veiculo veiculo = new Veiculo(modelo, marca, velocidade);

        int entrada = -1;
        while(entrada != 0){
            System.out.println("\nO quê você deseja fazer com o carro?");
            System.out.println("1 - Acelerar\n2 - Frear\n3 - Mostrar Dados\n0 - Sair");
            entrada = sc.nextInt();
            if(entrada == 1){
                System.out.println("Quantos km/h o carro irá acelerar? (números inteiros!");
                int aceleracao= sc.nextInt();
                veiculo.acelerar(aceleracao);
                System.out.println("O carro foi acelerado!");

            } else if (entrada == 2) {
                System.out.println("Quantos km/h o carro irá frear? (números inteiros!");
                int retardacao = sc.nextInt();
                veiculo.frear(retardacao);
            } else if (entrada ==3) {
                veiculo.mostrardados();
            } else if (entrada ==0) {
                break;
            }else {
                System.out.println("Por favor digite um número válido");
            }
        }
    sc.close();

    }

}
