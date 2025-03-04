/*
    Um programa para gerenciar os saques de um caixa eletrônico deve possuir algum
    mecanismo para decidir o número de notas de cada valor que deve ser disponibilizado
    para o cliente que realizou o saque. Um possível critério seria o da "distribuição ótima"
    no sentido de que as notas de menor valor fossem distribuídas em número mínimo
            possível. Por exemplo, se a quantia solicitada fosse R$ 87,00, o programa deveria indicar
    uma nota de R$ 50,00, três notas de R$ 10,00, uma nota de R$ 5,00 e duas notas de R$
    1,00. Escreva um programa que receba o valor da quantia solicitada e retorne a
    distribuição das notas de acordo com o critério da distribuição ótima (considere existir
    notas de R$1,00; R$2,00; R$5,00; R$10,00; R$20,00; R$50,00 e R$100,00).
*/
package cemExJava;

public class ex017 {
    public static void main(String[] args) {
        saque(887);
    }

    public static void saque(int request){
        int cem = request / 100;
        int cinquenta = (request - (cem * 100)) / 50;
        int vinte = (request - (cem * 100 + cinquenta * 50)) / 20;
        int dez = (request - (cem * 100 + cinquenta * 50 + vinte * 20)) / 10;
        int cinco = (request - (cem * 100 + cinquenta * 50 + vinte * 20 + dez * 10 )) / 5;
        int dois = (request - (cem * 100 + cinquenta * 50 + vinte * 20 + dez * 10 + cinco * 5)) / 2;
        int um = (request - (cem * 100 + cinquenta * 50 + vinte * 20 + dez * 10 + cinco * 5 + dois * 2)) / 1;
        int soma = (cem * 100 + cinquenta * 50 + vinte * 20 + dez * 10 + cinco * 5 + dois * 2);

        //System.out.printf("Nota de 100: %d \nNota de 50: %d \nNota de 20: %d \nNota de 10: %d \nNota de 5: %d \nNota de 2: %d \nNota de 1(?): %d", cem, cinquenta, vinte, dez, cinco, dois, um);

        System.out.printf("Nota de 100: %d \nNota de 50: %d \nNota de 20:", cem, cinquenta, vinte);
        System.out.printf("Nota de 10: %d \nNota de 5: %d \nNota de 2: %d \nNota de 1(?): %d", dez, cinco, dois, um);
        System.out.println("\nVerificação: " + soma);
    }
}
