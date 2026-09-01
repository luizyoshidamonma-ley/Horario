package Atv_11.Main;

import Atv_11.ContaBancaria.ContaBancaria;
import Atv_11.ContaPoupanca.ContaPoupanca;

public class Main {
    static void main() {
        ContaBancaria banco = new ContaBancaria("261072","Jorge",1000,"Caixa");
        ContaPoupanca poupanca = new ContaPoupanca("261072","Jorge",2000,"Caixa",20);

        banco.mostrarDados();
        System.out.println("");
        System.out.println(poupanca);
    }
}
