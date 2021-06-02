/* Guilherme David Niza 
4. Desenvolver um programa que leia uma matriz 2 x 2 de valores inteiros e apresente o seu determinante
*/
package ado3;

import java.util.Scanner;

public class Ex4 {
   
    public static void main(String[]args){
        
        int n = 2;
        Scanner leitor = new Scanner(System.in);
        int matriz [][] = new int [n][n];

        int determinate;

            for (int i = 0; i < matriz.length; i++) { // for que percorre as linhas
                
                for (int j = 0; j < matriz.length; j++) { // for que percorre as colunas
            
                    System.out.print("Valor [" + i + "][" + j + "]: ");
            
                    matriz[i][j] = leitor.nextInt();
                }
            } 
         determinate = (matriz [0][0] * matriz [1][1]) - (matriz [0][1] * matriz [1][0]);

         System.out.println("A determinante dessa matriz é = " + determinate);

         leitor.close();
    }
}
