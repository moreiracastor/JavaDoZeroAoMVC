/*
    Problema "media_idades"
    Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
    indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
    e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
    mostrar a mensagem "IMPOSSIVEL CALCULAR". 
 */

package estruturaLoop;

import java.util.Scanner;

public class mediaIdade {
    public static void main(String[] args) {
        int idade, contagem = 0, soma = 0;
        float media;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a idade: ");
        idade = sc.nextInt();


        while (idade > 0) {
            soma += idade;

            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            contagem ++;
        }

        sc.close();

        media = (float) soma/contagem;

        System.out.printf("Média das idades: %.2f", media);
    }
}
