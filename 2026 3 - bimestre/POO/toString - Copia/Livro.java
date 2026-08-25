package toString;

public class Livro {
    String titulo;
    String autor;
    int npagina;

    public Livro(String titulo,String autor,int npagina){
        this.titulo=titulo;
        this.autor=autor;
        this.npagina = npagina;
    }

    public Livro(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
    }

    public Livro(){

    }

    @Override
    public String toString(){
        return "Titulo:" + titulo
                + " Autor:" +autor
                + " Número de páginas:"+ npagina;
    }
}
