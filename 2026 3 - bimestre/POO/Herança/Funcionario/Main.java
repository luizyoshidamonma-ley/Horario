package Herança.Funcionario;

public class Main {
    static void main(String [] args) {
        Gerente boss = new Gerente("Baron",1,1000,2000);
        Vendedor worker = new Vendedor("Arauto",20,1000,50,20.0);
        Estagiario intern = new Estagiario("Grubs",300,1000,"Summoners Rift");
        System.out.print("----- Gerente -----");
        boss.apresentarDados();
        System.out.printf("Salário: %.2f%n",boss.calcularSalario());
        boss.realizarReuniao();
        System.out.println();

        System.out.print("----- Vendedor -----");
        worker.apresentarDados();
        System.out.printf("%nSalário: %.2f",worker.calcularSalario());
        worker.registarVendas();



        System.out.println();

        System.out.print("----- Estagiário -----");
        intern.apresentarDados();
        System.out.printf("%nSalário: %.2f",intern.calcularSalario());
        intern.realizarTreinamento();
        System.out.println();
    }
}
