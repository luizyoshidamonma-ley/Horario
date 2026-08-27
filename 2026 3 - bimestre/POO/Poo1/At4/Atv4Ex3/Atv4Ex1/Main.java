package Poo1.At4.Atv4Ex3.Atv4Ex1;
// \n

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex1Produto[] produtos= new Ex1Produto[2];

        for(int i=0;i<2;i++){
            System.out.printf("Produto %d\n",(i+1));

            System.out.println("Qual o nome do produto?");
            String nome = sc.nextLine();

            System.out.println("Qual o preço do produto?");
            double preco = sc.nextDouble();

            System.out.println("Qual a quantidade restante do produto?");
            int quantidade = sc.nextInt();

            sc.nextLine();

            produtos[i]= new Ex1Produto(nome,preco,quantidade);
        }

        System.out.println("-------------------------------------------------------");
        for(int i=0;i<2;i++) {
            produtos[i].mostrardados();
            System.out.println("------------------------------------");
        }
        sc.close();
    }
}