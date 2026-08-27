package Aplicação;

import modelo.Funcionario;

public class Gerente extends Funcionario {
    private double bonus=1000;

    public Gerente(double salario, String nome, int codigoInterno, String empresa){
        super (salario,nome,codigoInterno,empresa);


    }

    public void apresentarGerente(){
        System.out.println("Gerente: "+nome);
        System.out.println("Empresa: "+empresa);
        System.out.printf("Salario-base: R$ %.2f%n",getSalario());
        System.out.println("Bônus: R$ "+bonus);
    }

    public double calcularSalarioGerente(){
        return getSalario() + bonus;
    }



}
