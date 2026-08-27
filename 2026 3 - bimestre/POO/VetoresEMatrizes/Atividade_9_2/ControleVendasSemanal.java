package VetoresEMatrizes.Atividade_9_2;

import java.util.Scanner;

public class ControleVendasSemanal {
    Scanner sc = new Scanner(System.in);
    public ControleVendasSemanal(int[] vendas, int meta) {
        this.vendas = vendas;
        this.meta = meta;

        this.mediaDiaria = mediaDiaria;
    }

    int[] vendas;
    int meta,metaAtingida;
    double mediaDiaria;

    public void cabecalho(){
        System.out.printf("%nControle de Vendas Semanal%n%n");
    }



    public int calcularTotal (int[] vendas){
        int acumulador = 0;
        for (int i=0; i< 7; i++){
            acumulador += vendas[i];
        }
        return acumulador;
    }

    public int encontrarMaiorVenda (int[] vendas){
        int maior = vendas[0];
        for (int i=0;i<7;i++){
            if (vendas[i] > maior){
                maior = vendas[i];
            }
        }
        return maior;
    }

    public int contarDiasMetaAtingida(int[] venda, int meta){
        metaAtingida=0;
        for (int i=0 ;i < 7; i++){
            if (vendas[i] > 20){
                metaAtingida++;
            }
        }
        return metaAtingida;
    }

    public void mostrarVendas(int[] vendas){
        for (int i=0;i<7;i++){
            System.out.printf("Dia %d: %d vendas%n",(i+1),vendas[i]);
        }
    }

    public double mediaDiaria(int[] vendas){
        double media = 0,acumulador=0;
        for (int i=0;i<7;i++){
            acumulador+= vendas[i];
        }
        media = acumulador/7;
        return media;
    }




}
