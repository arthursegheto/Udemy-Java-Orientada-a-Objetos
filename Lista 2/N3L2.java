package Lista2;

import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class N3L2 {
    public static void main(String[] args) {
    
        /**Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
         *  Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
         *  ordem crescente ou decrescente.
         */ 
        
        Scanner s = new Scanner(System.in);
        
        int A, B; 
        
        System.out.println("Informe o valor de A: ");
        A = s.nextInt();
        
        System.out.println("Informe o valor de B: ");
        B = s.nextInt();
        
        if(A % B == 0 || B % A == 0){
            System.out.println("São múltiplos.");
        }else{
            System.out.println("Não são múltiplos.");
        }
        s.close();
    }
    
}
