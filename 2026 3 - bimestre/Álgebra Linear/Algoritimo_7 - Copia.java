import java.util.Scanner;

public class Algoritimo_7 {
    static void main(String[] args) {
      /*  7. Matriz identidade
        Implemente um algoritmo que gere automaticamente a matriz identidade de ordem n.*/

        Scanner sc = new Scanner(System.in);    // inialização do scanner para pegar o input do usuário
        System.out.println("Qual a quantidade de linhas da matriz?");   // pedir a quantidade de linhas
        int linhas = sc.nextInt();      // definir e pegar a quantidade de linhas
        sc.nextLine();  // limpar o scanner

        System.out.println("Qual a quantidade de colunas da matriz?");      // pedir a quantidade de colunas
        int colunas = sc.nextInt();     // definir e pegar a quantidade de colnas
        sc.nextLine();  // limpar o scanner

        int[][] matrix = new int[linhas][colunas];  // definir a matriz com as variáveis

        for (int i=0; i<linhas;i++){    // laço para preencher a matriz criada
            for (int j=0;j< colunas;j++){
                if (linhas == colunas) {    // se o número de linhas for igual o número de colunas (a matriz identidade deve ser quadrada
                    if (i == j) {   // se a posição i e j foram iguals (linhas e colunas respectivamente) significa que é a diagonal principal e portanto recebe valor 1
                        matrix[i][j] = 1;
                    } else {    // senão a posição não é a diagonal principal e portanto recebe 0
                        matrix[i][j] = 0;
                    }
                }else {     // senão (quantidade de linhas e colunas é diferente) a matriz não possui identidade pois não é quadrada
                    System.out.println("A matriz não é quadrada e portanto não possui identidade");
                    matrix[i][j]=0;
                }
            }
        }

        for (int i=0; i<linhas;i++){    // laço pra printar / mostrar a matriz identidade
            System.out.println();
            for (int j=0;j< colunas;j++){
                System.out.print(matrix[i][j]+"\t");
            }
        }


    }
}
