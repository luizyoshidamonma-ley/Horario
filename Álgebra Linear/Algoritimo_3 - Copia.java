import java.util.Scanner;

public class Algoritimo_3 {
    static void main() {
        /*3. Subtra ̧c ̃ao de matrizes
        Implemente um algoritmo que calcule
            C = A − B,

            verificando inicialmente se as matrizes possuem as mesmas dimens ̃oes.*/


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

        if (linhas1 == linhas2){    // se a quantidade de linhas das duas matrizes forem iguais passa
            if (colunas1 == colunas2){  // se a quantidade de colunas das duas matrizes forem iguais passa (se a quantidade de linhas e colunas forem iguais portanto tem o mesmo tamanho)
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


                for (int i = 0; i<linhas1 ; i++){        // laço pra motrar a matriz 1
                    System.out.println();
                    for (int j = 0; j <colunas1 ; j++){
                        System.out.print(matrix1[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz 1
                    }
                }

                System.out.println();
                for (int i = 0; i<linhas2 ; i++){        // laço pra motrar a matriz 2
                    System.out.println();
                    for (int j = 0; j <colunas2 ; j++){
                        System.out.print(matrix2[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz 2
                    }
                }

                //SOMA
                int [][] matrix3= new int[linhas1][colunas1];
                for (int i = 0; i<linhas1 ; i++){        // laço pra calcular a matriz 3 que é a diminuição das duas anteriores
                    for (int j = 0; j <colunas1 ; j++){
                        matrix3[i][j] = matrix1[i][j] - matrix2[i][j];  // calcula o valor da posição x e y (i e j) da matriz 3 diminuindo cada valor da mesma posição das matrizes 1 e 2
                    }
                }
                System.out.println();
                System.out.println("-----Subtração (Matriz 1 + Matriz 2)-----");     // separação para mostrar a soma das matrizes
                for (int i = 0; i<linhas1 ; i++){
                    System.out.println();// laço pra motrar a matriz 3
                    for (int j = 0; j <colunas1 ; j++){
                        System.out.print(matrix3[i][j]+"\t");// mostra cada valor x e y ( i e j) da matriz
                    }
                }

            }else {
                System.out.println("O número de colunas é diferente, é impossível realizar a soma");
            }
        }else {     // se a quantidade de linhas ou de colunas for diferente aparece o erro e não roda a soma
            System.out.println("o número de linhas é diferentes o que impossibilita a soma delas.");
        }

    }
}
