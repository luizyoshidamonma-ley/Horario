package Herança;

public class Main {
    static void main(String[] args) {

        Funcionario f = new Funcionario("Carlos",5000);
        Professor p = new Professor("Carlitos",6000,"programação");

        System.out.println(f);
        System.out.println(p);
        System.out.println("-------------------");
        f.apresentarFUncionario();
        p.apresentarProfessor();
        f.setSalario(10);
        p.setSalario(20);
        p.setDisciplina("programação");
        System.out.println("-------------------");
        f.apresentarFUncionario();
        p.apresentarProfessor();
    }
}
