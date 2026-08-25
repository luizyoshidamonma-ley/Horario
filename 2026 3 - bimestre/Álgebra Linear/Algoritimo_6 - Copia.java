import java.util.Scanner;

public class Algoritimo_6 {
    static void main() {
        /*6. Multiplica ̧c ̃ao de matrizes
        Implemente a multiplica ̧c ̃ao matricial

        C = AB.

                O programa dever ́a:
    • verificar se o n ́umero de colunas de A  ́e igual ao n ́umero de linhas de B;
    • informar quando a multiplica ̧c ̃ao n ̃ao puder ser realizada.
    C = A(i=1) * B(j=1) + A(i=1) * B(j+2) sucessivamente (laço normal)
    */

        Scanner sc = new Scanner(System.in);    // inialização do scanner para pegar o input do usuário
        System.out.println("Qual a quantidade de linhas da matriz número 1?");   // pedir a quantidade de linhas da matriz 1
        int linhas1 = sc.nextInt();      // definir e pegar a quantidade de linhas da matriz 1
        sc.nextLine();  // limpar o scanner

        System.out.println("Qual a quantidade de colunas da matriz número 1?");      // pedir a quantidade de colunas da matriz 1
        int colunas1 = sc.nextInt();     // definir e pegar a quantidade de colunas da matriz 1
        sc.nextLine();  // limpar o scanner

        int[][] matrix1 = new int[linhas1][colunas1];  // definir a matriz 1 com as variáveis

        System.out.println("Qual a quantidade de linhas da matriz número 2?");   // pedir a quantidade de linhas da matriz 2
        int linhas2 = sc.nextInt();      // definir e pegar a quantidade de linhas da matriz 2
        sc.nextLine();  // limpar o scanner

        System.out.println("Qual a quantidade de colunas da matriz número 2?");      // pedir a quantidade de colunas da matriz 2
        int colunas2 = sc.nextInt();     // definir e pegar a quantidade de colunas da matriz 2
        sc.nextLine();  // limpar o scanner

        int[][] matrix2 = new int[linhas2][colunas2];  // definir a matriz 2 com as variáveis

        System.out.println("-----Matriz 1-----");   // divisão para pegar os valores da matriz 1
        for (int i = 0; i<linhas1 ; i++){    // laço pra pegar o valor de cada posição da matriz 1
            for (int j = 0; j <colunas1 ; j++){
                System.out.printf("Qual o valor da posição %d ; %d ",i+1,j+1);  // pedir o valor da posição x e y (i e j) da matriz 1
                matrix1[i][j] = sc.nextInt();    // pegar o valor e colocar na sua casa correspondente
            }
        }
        System.out.println("-----Matriz 2-----");   // separação para a matriz 2
        for (int i = 0; i<linhas2 ; i++){    // laço pra pegar o valor de cada posição da matriz da matriz 2
            for (int j = 0; j <colunas2 ; j++){
                System.out.printf("Qual o valor da posição %d ; %d ",i+1,j+1);  // pedir o valor da posição x e y (i e j)
                matrix2[i][j] = sc.nextInt();    // pegar o valor e colocar na sua casa correspondente
            }
        }

        int[][] matrix3 = new int [linhas1][colunas2];      // define a matriz 3 para receber o resultado da multiplicação
        if (colunas1 == linhas2){   // se a quantidade de colunas da 1 for igual a quantidade de linhas da 2 pode realizar a multiplicação
            for(int i=0; i <linhas1;i++){   // laço pra percorrer toda a matriz (linha 1)
                for (int j=0;j<colunas2;j++){   // laço pra percorrer toda a matriz (coluna2) já que a multiplicação é a soma de toda a linha 1 multiplicado por toda coluna 2
                    matrix3[i][j] = 0;                     // Inicializa a posição com zero
                    for (int k = 0; k < colunas1; k++) {   // Percorre os elementos para fazer o produto escalar
                        matrix3[i][j] += matrix1[i][k] * matrix2[k][j];     // realiza a multiplicação
                    }
                }
            }
        }else   // se não não pode fazer a multiplicação
            System.out.println("A quantidade de linhas da primeira matriz é diferente da quantidade de colunas da segunda matriz, portanto a multiplicação delas é impossível");


        System.out.println("-----Matriz 1-----");
        for (int i = 0; i<linhas1 ; i++){        // laço pra motrar a matriz 1
            System.out.println();
            for (int j = 0; j <colunas1 ; j++){
                System.out.print(matrix1[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz 1
            }
        }

        System.out.println("-----Matriz 2-----");
        System.out.println();
        for (int i = 0; i<linhas2 ; i++){        // laço pra motrar a matriz 2
            System.out.println();
            for (int j = 0; j <colunas2 ; j++){
                System.out.print(matrix2[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz 2
            }
        }

        System.out.println("-----Matriz 3 (multiplicação da 1 e 2)-----");
        System.out.println();
        for (int i = 0; i<linhas1 ; i++){        // laço pra motrar a matriz 3 que é a matriz 1 vezes a matriz 2
            System.out.println();
            for (int j = 0; j <colunas2 ; j++){
                System.out.print(matrix3[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz 3
            }
        }

    }
}
