package VetoresEMatrizes;

import java.util.Scanner;

public class Matriz {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int linhas,colunas;
        System.out.println("Qual a quantidade de linhas?");
        linhas = sc.nextInt();
        System.out.println("Qual a quantidade de colunas?");
        colunas = sc.nextInt();

        int[][] matrix = new int[linhas][colunas];

        for (int i =0; i<linhas ; i++){
            for (int j = 0; j<colunas; j++){
                System.out.printf("%nQual o número da posição [%d][%d]",i,j);
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("-----Matriz-----");
        for (int i =0; i<linhas ; i++){
            for (int j = 0; j<colunas; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }



    }
}
