package Condicoes;

import java.util.Scanner;


public class Condicoes002 {
    public static void main(String[] args){
        // Decisão em linha única, shorthand de if
        Scanner scanner = new Scanner(System.in); //Criação do objeto para ler o terminal

        System.out.println("Digite o horário atual: ");
        int hora = scanner.nextInt();
        scanner.close();

        String resultado = (hora < 12) ? "Bom Dia" : (hora >= 12 && hora < 18) ? "Boa Tarde": "Boa noite" ;

        System.out.println(resultado);
    }
}
