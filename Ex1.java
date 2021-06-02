/* Guilherme David Niza 
1. Desenvolver uma função que recebe, por parâmetro, dois valores X e Z e calcula e retorna X^Z (sem utilizar funções
ou operadores de potência prontos).
*/
package ado3;

import java.util.Scanner;

public class Ex1 {
    
    static int potencia(int x, int z) { // Função que faz x^z.
        int resultado = 1;
        
            for (int i = 0; i < z; i++) {
                resultado *=  x; 
            }
            return resultado;
    }
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int x, z;
        
        System.out.print("X = ");
        x = leitor.nextInt();

        System.out.print("Z = ");
        z = leitor.nextInt();
    
        int resultado = potencia(x , z); // Chama a função potencia.
        System.out.println(x + "^" + z + " = " + resultado);

        leitor.close();
    }
}