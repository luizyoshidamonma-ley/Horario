package Herança.Heranca_conta;

public class Main {
    static void main(String [] args) {
        ContaPF contaPessoaFisica = new ContaPF("Luiz",1278967,1000,"12345678967");

        ContaPJ contaPessoaJuridica = new ContaPJ("Felipe",3456,2000,"00.123.123/0001-49");

        System.out.println("---- Pessoa Física ----");
        contaPessoaFisica.depositar(500);
        contaPessoaFisica.sacar(200);
        contaPessoaFisica.mostrarDados();

        System.out.println("---- Pessoa Jurídica  ----");
        contaPessoaJuridica.depositar(5000);
        contaPessoaJuridica.sacar(4900);
        contaPessoaJuridica.mostrarDados();
    }
}
