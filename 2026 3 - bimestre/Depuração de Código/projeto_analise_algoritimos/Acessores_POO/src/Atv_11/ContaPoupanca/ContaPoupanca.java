package Atv_11.ContaPoupanca;

import Atv_11.ContaBancaria.ContaBancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta,String titular, double saldo, String nomeBanco,double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
        super(numeroConta,titular, saldo, nomeBanco);
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public String toString() {
        // o override pra poder mostrar a conta poupança
        return "\nConta Poupanca" +
                "\nNúmero da conta: "+getNumeroConta()+
                "\nTitular: "+getTitular()+
                "\nNome do Banco: " + nomeBanco +
                "\nSaldo: " + saldo+
                "\nTaxa de rendimento: "+taxaRendimento
                ;
    }
}
