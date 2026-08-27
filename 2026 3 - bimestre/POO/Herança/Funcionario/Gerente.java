package Herança.Funcionario;

public class Gerente extends Funcionario{
    private double valorBonus;
    public Gerente(String nome, int matricula, float salarioBase, int valorBonus) {
        if (valorBonus < 0){
            System.out.println("O valor bônus deve ser maior do que 0");
            System.exit(1);
        }
        super(nome, matricula, salarioBase);
        this.valorBonus = valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase()+this.valorBonus;
    }

    @Override
    public void apresentarDados(){
        super.apresentarDados();
        System.out.printf("%nValor Bônus: %.0f%n",valorBonus);
    }

    public void realizarReuniao(){
        System.out.println("Reunião de emergência!");
    }

}
