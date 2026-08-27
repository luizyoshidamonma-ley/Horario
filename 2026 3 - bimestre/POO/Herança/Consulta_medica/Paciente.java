package Herança.Consulta_medica;

public class Paciente {
    private String nomepaciente;
    private int idade;
    private String CPF;

    public Paciente(String nomepaciente, int idade, String CPF) {
        if (nomepaciente != null && !nomepaciente.isEmpty()) {
            if (idade > 0) {
                if (CPF != null && !CPF.isEmpty()) {
                    this.nomepaciente = nomepaciente;
                    this.idade = idade;
                    this.CPF = CPF;
                }else {
                    System.out.println("O CPF não pode ser vazio!");
                    System.exit(1);
                }
            }else {
                System.out.println("A idade deve ser maior do que 0!");
                System.exit(1);
            }
        }else{
            System.out.println("O nome do paciente não pode ser vazio!");

        }
    }




    public String getNome() {
        return nomepaciente;
    }
    public void setNome(String nomepaciente) {
        this.nomepaciente = nomepaciente;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void apresentarPaciente(){
        System.out.printf("Nome: %s%nIdade: %d%nCPF: %s%n",nomepaciente,idade,CPF);
    }

    public void realizarConsulta(Medico medico){
        System.out.printf("O paciente %s realizará uma consulta com o %s da área %s%n",nomepaciente,medico.getNome(),medico.getEspecialidade());
    }

}
