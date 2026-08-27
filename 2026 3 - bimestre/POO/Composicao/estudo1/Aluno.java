package Composicao.estudo1;

public class Aluno {
    private Caderno notebook;
    private String nome;

    public Aluno (String nome){
        this.nome =nome;
        notebook = new Caderno(49, "Three ways to survive the apocalypse");
    }

    public void mostrar(){
        System.out.printf("Nome: %s%nPossui o caderno %s com %d páginas",nome,notebook.getCapa(),notebook.getNumeropaginas());
    }


}
