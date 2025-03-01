/*
    Problema "menor_de_tres"
    Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
    números lidos. Em caso de empate, mostrar apenas uma vez.
*/

package estruturaCondicionais;

import java.util.Scanner;

public class menorDeTres {
    public static void main(String[] args) {
        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        a = scan.nextInt();

        System.out.print("Digite o 2° número: ");
        b = scan.nextInt();
        
        System.out.print("Digite o 3° número: ");
        c = scan.nextInt();

        scan.close();

        if(a <= b && a <= c){
            System.out.printf("\nMenor número: %d\n", a);
        } else if (b <= a && b <= c){
            System.out.printf("\nMenor número: %d\n", b);
        } else if(c <= a && c <= b){
            System.out.printf("\nMenor número: %d\n", c);
        }
    }   
}
