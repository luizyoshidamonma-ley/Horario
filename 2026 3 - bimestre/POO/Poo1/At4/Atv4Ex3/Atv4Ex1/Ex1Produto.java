package Poo1.At4.Atv4Ex3.Atv4Ex1;

public class Ex1Produto {
    String nome;
    double preco;
    int quantidade;

    public Ex1Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void mostrardados() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade restante: " + quantidade);
    }



}