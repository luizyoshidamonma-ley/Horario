package Poo1.Atv5Ex1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos livros existem para cadastro? (Números inteiros)");
        int quantidadelivro = sc.nextInt();
        Livro[] apresentarLivro = new Livro[quantidadelivro];

        sc.nextLine();
        for (int i=0 ; i< quantidadelivro; i++){
            System.out.println("Qual o nome do título "+i);
            String titulo = sc.nextLine();

            System.out.println("Qual o autor do livro "+i);
            String autor = sc.nextLine();

            System.out.println("Qual o número de páginas?");
            int numeropaginas = sc.nextInt();
            sc.nextLine();

            apresentarLivro[i] = new Livro( titulo, autor,  numeropaginas);


        }
        System.out.println();
        for (int i=0; i<quantidadelivro; i++){
            System.out.println("---------------------------");
            apresentarLivro[i].mostrarLivros();
            System.out.println();
        }

    }

}
