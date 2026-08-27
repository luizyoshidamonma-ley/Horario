package Poo1.Atv5Ex1;

public class Livro {
    String titulo;
    String autor;
    int numeropaginas;

    public Livro (String titulo, String autor, int numeropaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeropaginas = numeropaginas;
    }

    public void mostrarLivros(){
        System.out.printf("O título %s do autor %s possui %d páginas",this.titulo,this.autor,this.numeropaginas);
    }

}
