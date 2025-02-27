// Dado o tamanho do raio de uma circunferência, calcular a área e o perímetro da mesma.
// Perimetro = 2pir Área = pir^2

package Exercicios;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        float raio = scan.nextFloat();

        scan.close();

        calcCircun(raio);
    }

    public static void calcCircun(double raio){
        double pi = 3.14;
        double perimetro = (double) 2*pi*raio;
        double area = pi*raio*raio;

        System.out.printf("Perimetro: %.2f \nArea: %.2f", perimetro, area);
    }
}
