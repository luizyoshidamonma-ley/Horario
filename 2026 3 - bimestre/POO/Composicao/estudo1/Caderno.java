package Composicao.estudo1;

public class Caderno {
    int numeropaginas;
    String capa;

    public Caderno(int numeropaginas, String capa) {
        this.numeropaginas = numeropaginas;
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "Caderno{" +
                "numeropaginas=" + numeropaginas +
                ", capa='" + capa + '\'' +
                '}';
    }

    public int getNumeropaginas() {
        return numeropaginas;
    }

    public void setNumeropaginas(int numeropaginas) {
        this.numeropaginas = numeropaginas;
    }

    public String getCapa() {
        return capa;
    }

    public void setCapa(String capa) {
        this.capa = capa;
    }
}
