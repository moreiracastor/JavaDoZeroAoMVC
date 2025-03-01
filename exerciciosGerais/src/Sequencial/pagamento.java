/*
 Problema "pagamento" Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e aquantidade
 de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário comuma mensagem explicativa, conforme
 exemplo.
*/

package Sequencial;

import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        String nome;
        float valHora, qtdeHora, salario;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        nome = scan.nextLine();

        System.out.print("Digite o valor por hora: ");
        valHora = scan.nextFloat();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        qtdeHora = scan.nextFloat();

        scan.close();

        salario = qtdeHora * valHora;

        System.out.printf("O salário do funcionário %s é R$%.2f", nome, salario);

    }
}
