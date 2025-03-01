/*
    Problema "consumo"
    Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
    combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
    médio do carro, com três casas decimais. 
*/

package Sequencial;

import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        float km, totalLitro;
        double kmLitro;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a distância percorrida: ");
        km = scan.nextFloat();

        System.out.print("Digite quanto o carro faz por litro: ");
        totalLitro = scan.nextFloat();

        scan.close();

        kmLitro = km/totalLitro;

        System.out.printf("O seu carro faz %.2fkm por litro", kmLitro);
        
    }
}
