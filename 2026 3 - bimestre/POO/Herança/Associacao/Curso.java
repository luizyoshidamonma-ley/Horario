package Herança.Associacao;

public class Curso {
    private String nomecurso;
    private int cargahoraria;

    public Curso(String nomecurso, int cargahoraria) {
        this.nomecurso = nomecurso;
        this.cargahoraria = cargahoraria;
    }

    public String getNomecurso() {
        return nomecurso;
    }

    public void setNomecurso(String nomecurso) {
        this.nomecurso = nomecurso;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

}
