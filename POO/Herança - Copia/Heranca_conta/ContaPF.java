package Herança.Heranca_conta;

// extends herda!!!
public class ContaPF extends Conta{
    private String CPF;

    public ContaPF(String titular, int numeroconta, double saldo, String CPF) {
        super(titular, numeroconta, saldo);
        this.CPF = CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public  void mostrarDados(){
        super.mostrarDados();
        System.out.println("CPF: "+CPF);
    }


}
