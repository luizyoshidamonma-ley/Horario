package Poo1.Atv6;

public class ReservaHotel_Gabarito {
    String nhospede;
    int nquarto;
    int qtddiarias;
    double vdiaria;

    public ReservaHotel_Gabarito(String nhospede, int nquarto, int qtddiarias, double vdiaria) {
        this.nhospede = nhospede;
        this.nquarto = nquarto;
        this.qtddiarias = qtddiarias;
        this.vdiaria = vdiaria;
    }


    @Override
    public String toString(){
        return"ReservaHotal{"+
                "nHospede =" +nhospede+"nQuarto =" + nquarto+"qtdDiarias= "+qtddiarias+"vDiarias= "+vdiaria;
    }

    public double calcularHospedagem(){
        return vdiaria * qtddiarias;
    }

    public double calcularHospedagem(double percentualDesconto){
        double valorNormal = calcularHospedagem();
        double valorDesconto = valorNormal*percentualDesconto/100;
        return valorNormal - valorDesconto;
    }

    public double calcularHospedagem(double PercentualDesconto,double taxa){
        double valorComDesconto = calcularHospedagem(PercentualDesconto);
        if (taxa >= 0){
            return valorComDesconto + taxa;
        }else {
            System.out.println("Erro! a taxa de serviço não pode ser negativa");
        }return valorComDesconto;
    }

}

