package Herança.Funcionario;

import java.io.PrintStream;

public class Funcionario {
    private String nome;
    private int matricula;
    private float salarioBase;

    public Funcionario(String nome, int matricula, float salarioBase) {
        if (nome == null || nome.trim().isEmpty()){
            System.out.println("O nome não pode ser vazio!");
            System.exit(1);
        } else if (matricula < 0) {
            System.out.println("A matrícula deve ser maior que 0!");
            System.exit(1);
        } else if (salarioBase < 0) {
            System.out.println("O salário base deve ser maior que 0!");
            System.exit(1);
        }
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    // getter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }

    // setter
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario(){
        return salarioBase *= 1;
    }



    public void apresentarDados(){
        System.out.println();
        System.out.printf("Funcionário: %s%nMatrícula: %s%nSalário Base: %.2f",nome,matricula,salarioBase);
    }
}
