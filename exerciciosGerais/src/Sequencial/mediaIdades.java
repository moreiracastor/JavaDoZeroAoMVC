/*
Problema "idades"
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. 
*/

package Sequencial;

import java.util.Scanner;

public class mediaIdades {
    public static void main(String[] args) {
        int idade1, idade2;
        float mediaIdade;
        String nome1, nome2;
        

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o 1° nome: ");
        nome1 = scan.next();
        
        System.out.print("Digite a 1° idade: ");
        idade1 = scan.nextInt();

        System.out.print("Digite o 2° nome: ");
        nome2 = scan.next();

        System.out.print("Digite a 2° idade: ");
        idade2 = scan.nextInt();

        scan.close();

        mediaIdade = (float) (idade1+idade2)/2;

        System.out.printf("A média das idades entre %s e %s é %.2f", nome1, nome2, mediaIdade);


    }
    
}