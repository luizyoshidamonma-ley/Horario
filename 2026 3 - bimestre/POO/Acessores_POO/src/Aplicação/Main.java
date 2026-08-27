package Aplicação;

import modelo.Funcionario;

public class Main {
    static void main() {
        Funcionario f = new Funcionario(4000,"Jorge",1234,"UniFil");

        System.out.println("Empresa: "+f.empresa);
        System.out.println(f.getSalario());
        System.out.println("Nome: "+f.getNome());
        System.out.println("Código interno: "+f.getCodigoInterno());
        f.setSalario(6767);

        f.apresentarDados();
        Gerente g = new Gerente(3333,"Sergio",1235,"UniFil");
        g.apresentarGerente();
        System.out.printf("Salário final: R$ %.2f %n",g.calcularSalarioGerente());

    }
}
