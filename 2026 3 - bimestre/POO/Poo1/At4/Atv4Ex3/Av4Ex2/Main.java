package Poo1.At4.Atv4Ex3.Av4Ex2;
// \n

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quem é o títular da conta?");
        String titular = sc.nextLine();
        System.out.println("Qual o número da conta?");
        int numeroconta = sc.nextInt();
        System.out.println("Qual o saldo disponível na conta?");
        double saldo = sc.nextDouble();


        Banco banco = new Banco(titular,numeroconta,saldo);

        int entrada=-1;
        while(entrada !=0) {
            System.out.println();
            System.out.printf("Bem vindo %s o que você deseja fazer?\n1)Depositar um valor\n2)Sacar um valor\n3)Verificar o saldo da conta\n0)Sair\n",titular);
            entrada = sc.nextInt();
            if(entrada == 1) {
                System.out.println("Qual o valor a ser depositado?");
                double valorDeposito = sc.nextDouble();
                banco.depositar(valorDeposito);
            } else if (entrada ==2) {
                System.out.println("Qual o valor a ser sacado?");
                double valorSaque = sc.nextDouble();
                banco.sacar(valorSaque);
            } else if (entrada == 3) {
                System.out.println();
                banco.mostrarsaldo();
            } else if (entrada == 0) {
                break;
            }else{
                System.out.println("Por favor digite uma opção válida");
                entrada = sc.nextInt();
            }


        }
    }



}
