package Poo1.Atv6;

public class ReservaHotel {
    private String nomeHospede;
    private int numeroQuarto;
    private int quantidadeDiaria;
    private double valorDiaria;

    public ReservaHotel(){
        this.nomeHospede = getNomeHospede();
        this.numeroQuarto = getNumeroQuarto();
        this.quantidadeDiaria = getQuantidadeDiaria();
        this.valorDiaria = getValorDiaria();


    }

    public double calcularHospedagem(){
        double valorTotal;
        valorTotal = (quantidadeDiaria * valorDiaria);
        return valorTotal;
    }

    public double calcularHospedagem(double percentualdesconto) {
        if (percentualdesconto >= 0  && percentualdesconto <= 100) {
            double valorTotal;
            valorTotal = (quantidadeDiaria * valorDiaria * ((100 - percentualdesconto) / 100));
            return valorTotal;
        }else {
            System.out.println("\nPercentual de desconto inválido!");
            System.exit(0);
        }
        return percentualdesconto;
    }

    public double calcularHospedagem(double percentualdesconto, double taxaservico) {
        if (percentualdesconto > 0 && percentualdesconto < 100 && taxaservico >0) {
            double valorTotal;
            valorTotal = (quantidadeDiaria * valorDiaria * ((100 - percentualdesconto) / 100) + taxaservico);
            return valorTotal;
        } else if (taxaservico < 0) {
            System.out.println("\nTaxa de serviço inválido!");
            System.exit(0);

        }else {
            System.out.println("\nPercentual de desconto inválido!");
            System.exit(0);
        }

        return percentualdesconto;
    }

    public String getNomeHospede(){ return nomeHospede; }
    public void setNomeHospede(String nomeHospede){
        if (nomeHospede == null || nomeHospede.isBlank()) {
            System.out.println("\nO nome é inválido!");
            System.exit(0);

        }else {
            this.nomeHospede = nomeHospede;
        }}

    public int getNumeroQuarto(){ return numeroQuarto; }
    public void setNumeroQuarto(int numeroQuarto) {
        if (numeroQuarto < 1) {
            System.out.println("O número de quarto é inválido!");
            System.exit(0);
        } else {
            this.numeroQuarto = numeroQuarto;

        }
    }

    public int getQuantidadeDiaria(){ return quantidadeDiaria; }
    public void setQuantidadeDiaria(int quantidadeDiaria) {
        if (quantidadeDiaria < 1) {
            System.out.println("Quantidade de diárias é inválida!");
            System.exit(0);
        } else {
            this.quantidadeDiaria = quantidadeDiaria;
        }
    }

    public double getValorDiaria(){ return valorDiaria; }
    public void setValorDiaria(double valorDiaria){
        if (valorDiaria < 1){
            System.out.println("O valor da diária é inválido!");
            System.exit(0);
        }else{
            this.valorDiaria = valorDiaria;
        }
       }

    @Override
    public String toString(){

        return "\nNome do hóspede:"+nomeHospede +"\nNúmero do quarto: "+ numeroQuarto + "\nQuantidade de diárias: "+quantidadeDiaria +"\nValor da diária: "+valorDiaria;
    }

}