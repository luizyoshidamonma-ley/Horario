package Composicao.Atv_10_B;

public class Escola {

    String nome;
    String localidade;
    String tipo;

    public Escola(String nome, String localidade, String tipo) {
        this.nome = nome;
        this.localidade = localidade;
        this.tipo = tipo;
    }

    public void mostrarEscolaProfessor(String nomeProfessor, String disciplinaProfessor){

        System.out.printf("%nA escola %s no local %s de tipo %s%nPossui o professor %s que ensina a disciplina %s%n",nome,localidade,tipo,nomeProfessor,disciplinaProfessor);
    }
}
