package Condicoes;

import java.util.Scanner;

public class Case {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int dec = scanner.nextInt();

        scanner.close();

        switch(dec){
            case 1:
                System.out.println("Teste um");
                break;
            case 2:
                System.out.println("Teste dois");
                break;
            default:
                System.out.println("Número não encontrado");
                break;
        }

    }
    
}
