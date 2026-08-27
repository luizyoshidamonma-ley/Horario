package Poo1.At4.Atv4Ex3.Av4Ex2;

import java.util.Scanner;

public class Banco {
    Scanner sc = new Scanner(System.in);

    String titular;
    int numeroconta;
    double saldo;

    // Construtor
    public Banco(String titular,int numeroconta,double saldo){
        this.titular = titular;
        this.numeroconta = numeroconta;
        this.saldo = saldo;


    }

    public void depositar(double valor){
        if (valor >0) {
            System.out.println("Qual é o valor a ser depositado?");
            this.saldo += valor;
            System.out.println("Efetuado!");
        }
    }

    public void sacar(double valor) {
        System.out.println("Qual o valor a ser sacado?");
        if (this.saldo>valor){
            saldo -= valor;
            System.out.println("Efetuado!");
        }
        else{
            System.out.println("Impossível realizar ação, saldo é menor que o valor a ser sacado");
        }
    }

    public void mostrarsaldo() {
        System.out.printf("O usuário %s de número de conta %d possui %.2f R$ de saldo",titular,numeroconta,saldo);
    }

}
