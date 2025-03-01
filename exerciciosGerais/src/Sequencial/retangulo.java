/*
Problema "retangulo"
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos. 
 */

package sequencial;

import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        double base, altura, area, perimetro, diagonal;

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo de Área, perimetro e diagonal de um retângulo.");

        System.out.print("Digite a altura: ");
        altura = scan.nextFloat();

        System.out.print("Digite a base: ");
        base = scan.nextFloat();

        scan.close();

        area = base*altura;
        perimetro = 2 * base + 2 * altura;
        diagonal = Math.sqrt((base*base + altura*altura));

        System.out.printf("Área: %.2f \nPerimetro: %.2f \nDiagonal: %.2f", area, perimetro, diagonal);
    }
}
