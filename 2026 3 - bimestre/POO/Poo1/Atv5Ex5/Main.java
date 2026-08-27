package Poo1.Atv5Ex5;

public class Main {
    static void main(String[] args) {
        String nomeitem = "fdsfsd";
        int quantidadedisponivel = 1;
        double precounitario = 20;
        itemEstoque item = new itemEstoque(nomeitem, quantidadedisponivel, precounitario);

        if (quantidadedisponivel >=0) {
            item.mostrarEstoque();
            item.adicionarQuantidade(3);
            item.mostrarEstoque();
            item.retirarQuantidade(5);
            item.mostrarEstoque();
        }

        if (quantidadedisponivel <0) {
            System.out.println("Erro! quantidade é negativa");
        }
        }
    }



