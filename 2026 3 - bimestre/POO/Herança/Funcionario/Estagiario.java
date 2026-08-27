    package Herança.Funcionario;

    public class Estagiario extends Funcionario{
        private String instituicaoEnsino;

        public Estagiario(String nome, int matricula, float salarioBase, String instituicaoEnsino) {
            super(nome, matricula, salarioBase);
            this.instituicaoEnsino = instituicaoEnsino;
        }

        public String getInstituicaoEnsino() {
            return instituicaoEnsino;
        }
        public void setInstituicaoEnsino(String instituicaoEnsino) {
            this.instituicaoEnsino = instituicaoEnsino;
        }

        @Override
        public double calcularSalario() {
            return super.calcularSalario();
        }

        @Override
        public void apresentarDados(){
            super.apresentarDados();
            System.out.printf("%nInstituição de Ensino: %s",instituicaoEnsino);
        }

        public void realizarTreinamento(){
            System.out.println();
            System.out.println("Treinamento finalizado! +1 de conhecimento");
        }
    }
