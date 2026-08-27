package Herança.Consulta_medica;

public class Medico {
    private String nomemedico;
    private String especialidade;
    private String CRM;

    public Medico(String nomemedico, String especialidade, String CRM) {
        if (nomemedico != null && !nomemedico.isEmpty()) {
            if (especialidade != null && !especialidade.isEmpty()) {
                if (CRM != null && !CRM.isEmpty()) {
                    this.nomemedico = nomemedico;
                    this.especialidade = especialidade;
                    this.CRM = CRM;
                }else {
                    System.out.println("O CRM não pode ser vazio!");
                }
            }else {
                System.out.println("A especialidade do médico não pode ser vazio!");
            }
        }else{
            System.out.println("O nome do médico não pode ser vazio!");
            System.exit(1);
        }
    }

    public String getNome() {
        return nomemedico;
    }

    public void setNome(String nomemedico) {
        this.nomemedico = nomemedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public void apresentarmedico(){
        System.out.printf("Nome: %s%nEspecialidade: %s%nCRM: %s%n",nomemedico,especialidade,CRM);
    }
}
