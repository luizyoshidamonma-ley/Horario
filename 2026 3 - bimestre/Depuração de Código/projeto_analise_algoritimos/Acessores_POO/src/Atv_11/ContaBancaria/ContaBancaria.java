package Atv_11.ContaBancaria;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    protected double saldo;
    public String nomeBanco;

    public ContaBancaria(String numeroConta,String titular, double saldo, String nomeBanco) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.nomeBanco = nomeBanco;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void mostrarDados(){
        // Get titular pq pra conta poupaça poder acessar o titular (private) ela precisa do get, ela pode pegar o saldo pq ela é filha (subclasse) da conta bancária e o saldo é protected (permitindo o acesso caso seja sub classe)
        System.out.printf("%nConca Bancária%nNúmero da conta: %s%nTitular: %s%nSaldo: %.2f%nNome do Banco: %s",getNumeroConta(),getTitular(),saldo,nomeBanco);
    }

}
