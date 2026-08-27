package Poo1.Atv6;

public class Main {
    public static void main(String [] args) {

        ReservaHotel reserva1 = new ReservaHotel();
        ReservaHotel reserva2 = new ReservaHotel();

        reserva1.setNomeHospede("Luiz");
        reserva1.setNumeroQuarto(2);
        reserva1.setQuantidadeDiaria(4);
        reserva1.setValorDiaria(500);


        reserva2.setNomeHospede("João");
        reserva2.setNumeroQuarto(2);
        reserva2.setQuantidadeDiaria(10);
        reserva2.setValorDiaria(700);

        System.out.println(reserva1);
        System.out.println(reserva2);
        System.out.printf("\nO valor da primeira reserva é: %.2f",reserva1.calcularHospedagem());
        System.out.printf("\nO valor da segunda reserva com desconto é: %.2f",reserva2.calcularHospedagem(40));
        System.out.printf("\nO valor da primeira reserva e da segunda reserva respectivamente com os descontos e taxas de serviço aplicadas são: %.2f ; %.2f",reserva1.calcularHospedagem(40,50),reserva2.calcularHospedagem(40,650));
    }

}
