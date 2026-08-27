package Herança.Consulta_medica;

public class Main {
    static void main() {
        Medico medico = new Medico("Mundo","Cardiologia","1");
        Paciente paciente = new Paciente("Akali",20,"342432");

        System.out.println("-----Médico-----");
        medico.apresentarmedico();
        System.out.println("-----Paciente-----");
        paciente.apresentarPaciente();
        paciente.realizarConsulta(medico);

        System.out.println("-----Após a consulta-----");
        medico.apresentarmedico();
        System.out.println();
        paciente.apresentarPaciente();
    }
}
