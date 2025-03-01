/*
    Problema "operadora"
    Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
    telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
    ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago. 
*/

package estruturaCondicionais;

import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float valorMinutos, valorPagar;
        int minutosUsados, minutosRestantes;

        valorMinutos = 100/50f;

        System.out.print("Digite os minutos utilizados: ");
        minutosUsados = scan.nextInt();

        if (minutosUsados <= 100){
            System.out.println("Valor a pagar: R$50,00");
        } else {
            minutosRestantes = minutosUsados-100;
            valorPagar = minutosRestantes * valorMinutos + 50;

            System.out.printf("Valor a pagar: R$%.2f", valorPagar);
        }

        scan.close();
    }
}
