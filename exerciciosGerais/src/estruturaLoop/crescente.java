/*
    Problema "crescente" (adaptado de URI 1113)
    Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
    mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
    programa deve finalizar quando forem digitados dois valores iguais. 
*/

package estruturaLoop;

import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = sc.nextInt();

        while(num1 != num2){
            if(num1 < num2){
                System.out.println("CRESCENTE. CONTINUA.\n");
            } else if(num2 < num1){
                System.out.println("DESCRESCENTE. CONTINUA.\n");
            }

            System.out.print("Digite o primeiro número: ");
            num1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            num2 = sc.nextInt();
        }

        System.out.println("PROGRAMA ENCERRADO.\n");

        sc.close();
    }
}
