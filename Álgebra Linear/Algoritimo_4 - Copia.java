import java.util.Scanner;

public class Algoritimo_4 {
    static void main() {


    /*4. Multiplica ̧c ̃ao de uma matriz por um escalar
    Implemente um programa que receba um n ́umero real k e uma matriz A, calculando

            B = kA.*/

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

        int [][] matrixK = new int[linhas][colunas];    // declaração da matriz multiplicada por k
        System.out.println("Qual o número escalar k a ser multiplicado a matriz?");     // pedir o número que vai ser multiplicado
        int k = sc.nextInt();   // declara e pega esse número na variável k
        for (int i = 0; i<linhas ; i++){    // laço pra multipicar o valor por cada posição da matriz
            for (int j = 0; j <colunas ; j++) {
                matrixK[i][j] = matrix[i][j] * k;   // multiplica a posição x e y (i e j) por K
            }
        }

        System.out.printf("-----Matriz multiplicada por %d-----",k);
        for (int i = 0; i<linhas ; i++){        // laço pra motrar a matriz multiplicada
            System.out.println();
            for (int j = 0; j <colunas ; j++){
                System.out.print(matrixK[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz
            }
        }

    }
}
