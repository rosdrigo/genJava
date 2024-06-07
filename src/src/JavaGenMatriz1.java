package src;

import java.util.*;



public class JavaGenMatriz1 {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);

        int linha, coluna, variavelPrimaria = 0, variavelSecundaria = 0;

        System.out.println("Digite a quantidade de linhas: ");
        linha = sc.nextInt();

        System.out.println("Digite a quantidade de colunas: ");
        coluna = sc.nextInt();

        int[][] matriz = new int[linha][coluna];

        for(int i = 0; i < linha; i++) {
            for(int j = 0; j < coluna; j++) {
                System.out.println("Digite o "+(j+1)+"º elementos: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elementos da diagonal Principal: ");
        for(int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        System.out.println("Elementos da diagonal secundária: ");
        for(int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][2 - i] + " ");
        }

        System.out.println();

        System.out.println("Soma dos Elementos da Diagonal Principal: ");
        for(int i = 0; i < matriz.length; i++) {
            variavelPrimaria += matriz[i][i];
        }
        System.out.print(variavelPrimaria);

        System.out.println();

        System.out.println("Soma dos Elementos da Diagonal Secundária: ");
        for(int i = 0; i < matriz.length; i++) {
            variavelSecundaria += matriz[i][2 - i];
        }
        System.out.print(variavelSecundaria);
        sc.close();

    }

}