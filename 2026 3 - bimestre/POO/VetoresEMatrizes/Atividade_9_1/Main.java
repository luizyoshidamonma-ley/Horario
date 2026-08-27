package VetoresEMatrizes.Atividade_9_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main analise = new Main();
        Scanner sc = new Scanner(System.in);

        int alunos = 6;

        double[] notas = new double[alunos];

        analise.cabecalho();

        analise.preencherNotas(notas, sc);

        double media = analise.mediaNotas(notas, alunos);

        int aprovados = analise.quantidadeAprovados(notas, alunos);

        analise.mostrarNotas(notas, alunos);

        System.out.printf("%nMédia da turma: %.1f%n", media);
        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Quantidade de reprovados: " + (alunos - aprovados));

        sc.close();
    }

    public void cabecalho() {
        System.out.printf("%n%nAnálise de notas da turma%n");
        System.out.println("--------------------------");
    }

    public void preencherNotas(double[] notas, Scanner entrada) {
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Qual é a nota do aluno " + (i + 1));
            notas[i] = entrada.nextDouble();
        }
    }

    public double mediaNotas(double[] notas, int alunos) {
        double acumulador = 0, mediaFinal = 0;

        for (int i = 0; i < alunos; i++) {
            acumulador += notas[i];
            mediaFinal = acumulador / alunos;
        }

        return mediaFinal;
    }

    public int quantidadeAprovados(double[] notas, int alunos) {
        int quantidadeAlunosAprovado = 0;

        for (int i = 0; i < alunos; i++) {
            if (notas[i] >= 6) {
                quantidadeAlunosAprovado++;
            }
        }

        return quantidadeAlunosAprovado;
    }

    public void mostrarNotas(double notas[], int alunos) {

        System.out.println("\n----- Notas -----");

        for (int i = 0; i < alunos; i++) {
            System.out.printf("Aluno %d: %.1f%n", (i + 1), notas[i]);
        }
    }
}