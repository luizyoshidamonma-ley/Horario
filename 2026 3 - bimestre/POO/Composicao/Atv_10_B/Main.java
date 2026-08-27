package Composicao.Atv_10_B;

public class Main {
    static void main() {
        Professo prof = new Professo("Marcelo","POO");
        Escola escola = new Escola("Unifil","Londrina","Graduação superior");

        escola.mostrarEscolaProfessor(prof.getNome(), prof.getDisciplina());
    }
}
