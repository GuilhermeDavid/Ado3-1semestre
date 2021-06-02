/* Guilherme David Niza
3. Um vetor é palíndromo se ele não se altera quando as posições das componentes são invertidas. Por exemplo, o
vetor v = {1, 3, 5, 2, 2, 5, 3, 1} é palíndromo. Desenvolver uma função que recebe por parâmetro um vetor de
inteiros e retorna uma valor booleano indicando de o vetor é ou não palíndromo.
*/
package ado3;

import java.util.Scanner;

public class Ex3 {
    
    static void verificarpalidromo(int v [], int tamanho){

    int i = 0; // verifica o primeiro valor do vetor

    int j = (tamanho-1); // verifica o ultimo valor do vetor

    boolean palindromo = true; 

        while ((i < j) && (palindromo == true)) { // percorre todos os valores do vetor de forma espelhada, "Primeiro com ultimo" "Segundo com penultimo" e assim em diante ate achar um valor diferente ou acabar o vetor.

            if (v[i] != v[j])

            palindromo = false; 

                else {
                i = i + 1;
                j = j - 1;
                }
        } 
        if (palindromo == true) 
            System.out.println("O vetor é palindromo");
         
        else 
            System.out.println("O vetor não é palindromo");
        
    }   
    public static void main(String[]args){
        
        Scanner leitor = new Scanner(System.in);
        
        int tamanho;

        System.out.print("Tamanho do vetor = ");
        tamanho = leitor.nextInt();
        
        int vetor[] = new int[tamanho];

            for (int i = 0; i < vetor.length; i++){
                
                System.out.print("[" + i + "]: ");
                
                vetor[i] = leitor.nextInt();
            }
            verificarpalidromo(vetor, tamanho);           
            
            leitor.close();
    }
}