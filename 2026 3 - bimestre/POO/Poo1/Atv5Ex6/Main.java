package Poo1.Atv5Ex6;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        String nomecidade = "Londrina";
        int temperatura = 26;
        String unidademedida = "Celcius";
        Temperatura temp = new Temperatura (nomecidade,temperatura,unidademedida);

        temp.mostrarDados();

        System.out.println("\nQual o valor a ser aumentado à temperatura?");
        valor = sc.nextInt();
        if (valor >= 0){
            temp.aumentarTemperatura(valor);
        } else {
            System.out.println("Valor inválido!");
        }

        sc.nextLine();

        System.out.println(temp);

        System.out.println("\nQual o valor a ser diminuida à temperatura?");
        valor = sc.nextInt();
        if (valor >= 0) {
            temp.diminuirTemperatura(valor);
        }else {
            System.out.println("Valor inválido!");
        }

        sc.nextLine();

        System.out.println(temp);
    }
}
