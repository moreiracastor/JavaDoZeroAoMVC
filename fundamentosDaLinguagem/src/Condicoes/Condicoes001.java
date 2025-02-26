package Condicoes;

import java.util.Scanner;

public class Condicoes001 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in); //Cria um objeto que lê a entrada do terminal 
        System.out.println("Digite seu nome: ");

        String nomeUser = scanner.nextLine(); // Captura a próxima linha digitada
        System.out.printf("Olá %s, seja bem vindo\n", nomeUser);

        System.out.printf("Digite sua idade: ");
        int idade = scanner.nextInt(); // Captura o próximo número inteiro

        voto(nomeUser, idade);

        scanner.close(); // Fecha o objeto
    }

    public static void voto(String nome, int idade){
        if (idade >= 18 && idade < 60) {
            System.out.printf("Parabéns %s você está apto a votar.", nome);
        } else if (idade < 16) {
            System.out.printf("Infelizmente, %s, você não poderá votar", nome);
        } else if (idade == 16 || idade == 17){
            System.out.printf("%s seu voto é opcional", nome);
        } else {
            System.out.printf("o Sr(a), %s, não é obrigado a votar", nome);
        }
    }
}
