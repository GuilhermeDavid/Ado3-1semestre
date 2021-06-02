/* Guilherme David Niza
2. Desenvolver um programa que leia um vetor de 16 posições de valores inteiros e troque os 8 primeiros valores
pelos 8 últimos valores e vice-versa. Ao final apresentar na tela os dados do vetor obtido.
*/
package ado3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        int n = 16;
        int [] vetor = new int [n];
        int j = 8;
            
            for (int i = 0; i < n; i++) {

                System.out.print("[" + i + "]: ");
                
                vetor[j] = leitor.nextInt();
                
                j += 1;
                
                if (j == 16) {
                    
                    j = 0;
                }
            }
            
        int contador = 0;

            while (contador < 16){
                    
                System.out.print(vetor[contador]);

                System.out.print(" ");

                contador += 1;
            }
                   
            leitor.close();
    }
}
