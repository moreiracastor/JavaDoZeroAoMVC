/*
Problema "circulo"
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋*𝑟²
Você podeusar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use diretamente o valor 3.14159. 
 */

package Sequencial;

import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        float raio;
        double pi, area;

        Scanner scan = new Scanner(System.in);

        System.out.printf("Digite o raio: ");
        raio = scan.nextFloat();

        scan.close();

        pi = Math.PI;
        area = pi*Math.pow(raio, 2);

        System.out.printf("ÁREA: %.3f", area);
    }
}
