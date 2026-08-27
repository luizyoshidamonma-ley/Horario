package Composicao.Estudo_4;

public class Jogador {
    String nome;
    Personagem personagem;

    public Jogador(String nome) {
        personagem = new Personagem("Kassadin void walker",2000);
        this.nome = nome;
    }



    public void atacar (){
        System.out.printf("%nO jogador %s%n",nome);
        personagem.personagemAtacar();
    }
}
