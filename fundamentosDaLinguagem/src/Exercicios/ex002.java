// Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo. 

package Exercicios;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        float lado = scan.nextFloat();

        scan.close();

        calcQuad(lado);
    }

    public static void calcQuad(float lado){
        float perimetro = lado*4;
        float area = lado*lado;

        System.out.printf("Perimetro: %.2f\nArea: %.2f", perimetro, area);
    }

}
