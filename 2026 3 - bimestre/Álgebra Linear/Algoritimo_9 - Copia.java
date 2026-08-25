import java.util.Scanner;

public class Algoritimo_9 {
    static void main(String[] args) {
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

        int [][] transposta = new int[colunas][linhas];     // declarar a matriz transposta
        for(int i=0; i <colunas; i++){      // laço para percorrer toda a matriz
            for (int j=0; j<linhas;j++){
                transposta[i][j] = matrix[j][i];    // a transposta recebe cada valor da matriz original mas com as colunas no lugar das linhas
            }
        }

        boolean simetria = true;    // variável para printar / mostrar o resultado ao usuário
        for(int i=0; i <linhas; i++){   // laço para percorrer toda a matriz transposta
            for (int j=0; j<colunas;j++){
                
                if (transposta[i][j] != matrix[i][j]){      // se a transposta for diferente da matriz (valores diferentes na mesma posição) a simetria é falsa (qualquer valor fora da diagonal principal é diferente)
                    simetria = false;
                    break;
                }else {     // se não a simetria continua
                    simetria = true;
                }
            }
        } if (simetria == true){    // se a variável simetria perpetuar a matriz é simétrica
            System.out.println("A matriz é simétrica");
        } else if (simetria == false) {
            System.out.println("A matriz não é simétrica");     // se não a matriz não é simétrica
        }

    }
}
