/*
    Problema "duracao"
    Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
    formato horas:minutos:segundos 
*/

package sequencial;

import java.util.Scanner;

public class convSegundos {
    public static void main(String[] args) {
        int segundos, minutos, horas, restSegundos; 

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        segundos = scan.nextInt();

        scan.close();

        horas = segundos / 3600;
        minutos = (segundos % 3600) / 60;
        restSegundos = segundos % 60; 

        System.out.printf("%02d:%02d:%02d", horas, minutos, restSegundos);
    }
}
