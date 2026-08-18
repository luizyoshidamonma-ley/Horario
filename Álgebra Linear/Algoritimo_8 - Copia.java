import java.util.Scanner;

public class Algoritimo_8 {


    static void main(String[] args) {
        /*8. Verifica ̧c ̃ao de matriz diagonal
    Escreva um programa que determine se uma matriz quadrada  ́e diagonal.*/

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

        if(linhas != colunas){  // verifica se a matriz é quadrada pois apenas matrizes quadradas podem ter diagonal
            System.out.println("A matriz não é quadrada, portanto não é diagonal!");
        }
        boolean diagonal = true;    // variável para saber qual resposta dar ao usuário
        for (int i=0; i<linhas ; i ++){     // laço para verificar a diagonal
            for (int j=0; j<colunas; j++){
                if (i != j && matrix[i][j] !=0){    // se as linhas e colunas forem diferente ao mesmo tempo que o valor é diferente de 0 a diagonal é falsa, pois a matriz diagonal possui apenas a diagonal principal com valores, todas as outras posições devem ser 0
                    diagonal = false;
                    break;
                }
            }
        }

        for (int i = 0; i<linhas ; i++){        // laço pra motrar a matriz
            System.out.println();
            for (int j = 0; j <colunas ; j++){
                System.out.print(matrix[i][j]+"\t");   // mostra cada valor x e y ( i e j) da matriz
            }
        }
        if(diagonal == true){   // caso a variável definida na linha 31 seja verdadeira printa / mostra que a matriz é diagonal
            System.out.println();
            System.out.println("A matriz é diagonal!");
        }else {     // caso contrário a matriz não é diagonal
            System.out.println();
            System.out.println("A matriz não é diagonal");
        }

    }
}
