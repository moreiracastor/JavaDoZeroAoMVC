/*
    Leia um valo0r inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    X, se for o caso.
*/

package estruturaLoop;

import java.util.Scanner;

public class somaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, soma = 0;
        
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();

        for(int i = 0; i < num; i++){
            soma += num;

            System.out.print("Digite um número inteiro: ");
            num = sc.nextInt();
       }

       sc.close();

       System.out.printf("A soma dos números: %d\n", soma);
    }  
}
