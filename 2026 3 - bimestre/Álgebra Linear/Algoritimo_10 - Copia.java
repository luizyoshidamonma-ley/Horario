import java.util.Scanner;

public class Algoritimo_10 {
    static void main(String[] args) {
//        Tra ̧co de uma matriz
//        Implemente um programa que calcule o tra ̧co de uma matriz quadrada,
//
//                tr(A) = Xn
//        i=1
//        aii.

        Scanner sc = new Scanner(System.in);    // inialização do scanner para pegar o input do usuário
        System.out.println("Qual a quantidade de linhas da matriz?");   // pedir a quantidade de linhas
        int linhas = sc.nextInt();      // definir e pegar a quantidade de linhas
        sc.nextLine();  // limpar o scanner

        System.out.println("Qual a quantidade de colunas da matriz?");      // pedir a quantidade de colunas
        int colunas = sc.nextInt();     // definir e pegar a quantidade de colnas
        sc.nextLine();  // limpar o scanner

        int[][] matrix = new int[linhas][colunas];  // definir a matriz com as variáveis

        for (int i = 0; i<linhas ; i++){    // laço pra pegar o valor de cada posição da matriz
            for (int j = 0; j <colunas ; j++){
                System.out.printf("Qual o valor da posição %d ; %d ",i+1,j+1);  // pedir o valor da posição x e y (i e j)
                matrix[i][j] = sc.nextInt();    // pegar o valor e colocar na sua casa correspondente
            }
        }


        // Calculo do traço da Matriz quadrada (soma da diagonal principal)
        double acumulador = 0;  // definir a variável de acumulação (total da soma da diagonal principal)
        if (linhas == colunas) {    // o traço da matriz só pode ser calculado se a matriz for quadrada ou seja se a quantidade de linhas e colunas for iguais
            for (int i = 0; i < linhas; i++) {    // laço pra passar por toda a matriz
                for (int j = 0; j < colunas; j++) {
                    if (i == j) {    // se o valor de i e j forem iguals (linhas e colunas,) significa que é a diagonal principal e portanto a acumulador deve receber o valor da posição i j da matriz
                        acumulador += matrix[i][j];
                    }
                }
            }
            System.out.printf("O traço da matriz (soma da diagonal principa) é %.2f",acumulador);
        }else{
            System.out.println("A matriz não possui traço pois não é quadrada");
        }



    }
}
