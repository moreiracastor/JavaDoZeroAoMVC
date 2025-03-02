/*
    Problema "troco_verificado"
    Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
    O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
    e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
    ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
    valor restante conforme exemplo
*/

package estruturaCondicionais;

import java.util.Scanner;

public class trocoVerificado {
    public static void main(String[] args) {
        float troco, pagamento, precoUnid;
        int qtde;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: R$");
        precoUnid = sc.nextFloat();

        System.out.print("Digite a quantidade: ");
        qtde = sc.nextInt();

        System.out.print("Dinheiro recebido: R$");
        pagamento =  sc.nextFloat();

        sc.close();

        if (pagamento > precoUnid*qtde){
            troco = pagamento - precoUnid*qtde;

            System.out.printf("O troco é: R$%.2f", troco);
        } else {
            troco = Math.abs(pagamento - precoUnid*qtde);
            System.out.printf("Dinheiro Insuficiente. Falta R$%.2f", troco);
        }
    }
}
