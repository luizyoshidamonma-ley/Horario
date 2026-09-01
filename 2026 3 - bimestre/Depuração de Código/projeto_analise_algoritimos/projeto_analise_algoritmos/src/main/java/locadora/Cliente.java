package locadora;

// TODO: adicionar Javadoc da classe.
public class Cliente {

    private String nome;
    private int idade;
    private int anosHabilitado;

    // TODO: adicionar Javadoc do construtor.
    public Cliente(String nome, int idade, int anosHabilitado) {
        this.nome = nome;
        this.idade = idade;
        this.anosHabilitado = anosHabilitado;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getAnosHabilitado() {
        return anosHabilitado;
    }

    // TODO: adicionar Javadoc.
    public boolean isApto() {
        return idade >= 21 && anosHabilitado >= 2;
    }
}
