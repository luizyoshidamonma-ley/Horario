package Herança.Funcionario;

public class Vendedor extends Funcionario{
    private double valorVendas;
    private double percentualComissao;
    public Vendedor(String nome, int matricula, float salarioBase,double valorVendas,double percentualComissao) {
        if (valorVendas < 0 ){
            System.out.println("O valor de vendas deve ser maior do que 0");

        } else if (percentualComissao < 0 && percentualComissao > 100) {
            System.out.println("O percentual de comissaão deve ter um valor entre 0 e 100");
            System.exit(1);
        }
        super(nome, matricula, salarioBase);
        this.valorVendas = valorVendas;
        this.percentualComissao= percentualComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }
    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public double comissao(){
        return this.valorVendas * this.percentualComissao/100.0;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase()+comissao();
    }

    @Override
    public void apresentarDados(){
        super.apresentarDados();
        System.out.printf("%nValor de Vendas: %.1f%nPercentual de Comissão: %.1f",valorVendas,percentualComissao);
    }

    public void registarVendas(){
        System.out.println();
        System.out.println("A sua venda foi registrada no sistema");
    }


}
