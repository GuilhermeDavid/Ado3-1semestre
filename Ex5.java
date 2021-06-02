/* Guilherme David Niza
5. Desenvolver uma função que recebe uma matriz bidimensional por parâmetro e retorne a transposta desta matriz.
*/

package ado3;

import java.util.Scanner;

public class Ex5 {
    
    static void lermatriz(int matriz [][], int a, int b) {
        Scanner leitor = new Scanner(System.in);
        
        for ( int i = 0; i < a; i++) { // for que percorre as linhas
                
            for ( int j = 0; j < b; j++) { // for que percorre as colunas
        
                System.out.print("Valor [" + i + "][" + j + "]: ");
        
                matriz[i][j] = leitor.nextInt();
            }
        }
            leitor.close();
    }
    static void transposta(int matriz[][], int a, int b) {
         
        for (int i = 0; i < a; i++) {
        
            for (int j = 0; j < b; j++) {
            
                System.out.print(matriz[j][i] + " ");
            
            }
            System.out.println("");
        }
    }
        
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        int i, j;

        System.out.print("Quantidade de colunas da matriz = ");
        i = leitor.nextInt();

        System.out.print("Quantidade de linhas da matriz = ");
        j = leitor.nextInt();

        int matriz [][] = new int [i][j];

        lermatriz(matriz, i , j);
        
        transposta(matriz, i , j);

        leitor.close();
    }
}