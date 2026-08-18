import java.util.Scanner;

public class Algoritimo_5 {
    static void main() {
        /*
        5. Transposta de uma matriz
        Implemente um algoritmo que receba uma matriz A e calcule sua transposta

        A^t
        */

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

        System.out.println("-----Matriz antes de ser transposta-----");
        for (int i = 0; i<linhas ; i++){        // laço pra motrar a matriz
            System.out.println();
            for (int j = 0; j <colunas ; j++){
                System.out.print(matrix[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz
            }
        }


        int[][] matrixtrans = new int[colunas][linhas];  // definir uma nova matriz com as variáveis para ser a transposta
        for (int i = 0; i<linhas ; i++){
            for (int j = 0; j <colunas ; j++){
                matrixtrans[j][i] = matrix[i][j];   // a posição da matriz tansposta é a inversa da matriz normal
            }
        }
        System.out.println();
        System.out.println("-----Matriz depois de ser transposta-----");
        for (int i = 0; i<colunas ; i++){        // laço pra motrar a matriz
            System.out.println();
            for (int j = 0; j <linhas ; j++){
                System.out.print(matrixtrans[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz
            }
        }

    }
}
