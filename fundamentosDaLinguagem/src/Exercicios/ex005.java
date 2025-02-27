// Ler um número inteiro e exibir o seu sucessor.

package Exercicios;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args){
        int num;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        num = scan.nextInt();

        scan.close();

        System.out.printf("%d < %d < %d", num - 1, num, num + 1);
    }
}
