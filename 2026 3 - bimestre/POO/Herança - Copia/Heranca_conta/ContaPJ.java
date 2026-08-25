package Herança.Heranca_conta;

public class ContaPJ extends Conta {
    private String CNPJ;

    public ContaPJ(String titular, int numeroconta, double saldo, String CNPJ) {
        super(titular, numeroconta, saldo);
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("CNPJ: "+CNPJ);
    }

}
