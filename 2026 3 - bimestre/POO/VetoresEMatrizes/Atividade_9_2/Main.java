package VetoresEMatrizes.Atividade_9_2;

import java.util.Scanner;

public class Main {
    static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
      int [] vendas = new int[7];
      preencherVendas(vendas,sc);


        ControleVendasSemanal controle = new ControleVendasSemanal(vendas,20);

        controle.cabecalho();
        controle.mostrarVendas(vendas);
        System.out.printf("%nO total de vendas é: "+controle.calcularTotal(vendas)+"%n");
        System.out.printf("%nMédia diária: %.2f%n",controle.mediaDiaria(vendas));
        System.out.printf("%nA maior venda é: "+controle.encontrarMaiorVenda(vendas)+"%n");
        System.out.printf("%nQuantidade de dias que a meta foi atingida:"+controle.contarDiasMetaAtingida(vendas,20)+"%n");


    }

    static public void preencherVendas(int [] vendas, Scanner entrada){
        for (int i=0; i < 7 ; i++){
            System.out.println("Qual a quantidade de vendas no dia "+(i+1));
            vendas[i] = entrada.nextInt();
        }
    }

}
