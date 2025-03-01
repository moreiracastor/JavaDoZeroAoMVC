/*
Problema "troco"
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
mostrar o valor do troco a ser devolvido ao cliente. 
*/

package Sequencial;

import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        float preco, dinheiro, troco;
        int qtde;

        Scanner scan = new Scanner(System.in);

        System.out.print("Preço unitário do produto(R$): ");
        preco = scan.nextFloat();

        System.out.print("Digite a quantidade(unid.): ");
        qtde = scan.nextInt();

        System.out.print("Dinheiro recebido(R$): ");
        dinheiro = scan.nextFloat();

        scan.close();

        troco = dinheiro - preco*qtde;

        System.out.printf("O troco é R$%.2f", troco);
        
    }
}
