package Poo1.Atv5Ex5;

public class itemEstoque {

    String nomeitem;
    int quantidadedisponivel;
    double precounitario;

    public itemEstoque(String nomeitem,int quantidadedisponivel,double precounitario){
        this.nomeitem = nomeitem;
        this.quantidadedisponivel = quantidadedisponivel;
        this.precounitario = precounitario;
    }

    public void adicionarQuantidade (int quantidade) {
        this.quantidadedisponivel += quantidade;
    }

    public void retirarQuantidade (int quantidade){
        if (quantidade > this.quantidadedisponivel){
            System.out.println("Erro! A quantidade a ser retirada é maior que o estoque");
        } else if (quantidade >= quantidadedisponivel) {
            this.quantidadedisponivel -= quantidade;
        }else{
            System.out.println("Erro! valor inválido");
        }

    }

    public void mostrarEstoque (){
        System.out.printf("o item %s possui %d em estoque e possui preço unitário de %.2f R$",this.nomeitem,this.quantidadedisponivel,this.precounitario);
        System.out.println();
    }

}
