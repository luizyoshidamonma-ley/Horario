package Herança.Heranca_conta;

public class Conta {
    private String titular;
    private int numeroconta;
    private double saldo;

    // Construtor
    public Conta(String titular, int numeroconta, double saldo) {
        this.titular = titular;
        this.numeroconta = numeroconta;
        this.saldo = saldo;
    }

    // Getter
    public String getTitular() {
        return titular;
    }
    public int getNumeroconta() {
        return numeroconta;
    }
    public double getSaldo() {
        return saldo;
    }

    // Setter
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valorDeposito){
        if (valorDeposito >0){
            saldo += valorDeposito;
            System.out.println("Depósito realizado com sucesso!");
        }else {
            System.out.println("O valor inserido é inválido! O valor deve ser maior do que 0");
        }

    }

    public void sacar (double valorSaque){
        if (valorSaque >0 && valorSaque <= saldo){
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        }else {
            System.out.println("O valor inserido é inválido! O valor deve ser maior do que 0 e menor que o saldo!");
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "titular='" + titular + '\'' +
                ", numeroconta=" + numeroconta +
                ", saldo=" + saldo +
                '}';
    }

    public void mostrarDados(){
        System.out.println("Titular: "+titular);
        System.out.println("Número da Conta: "+numeroconta);
        System.out.printf("Saldo: %.2f%n",saldo);
    }

}
