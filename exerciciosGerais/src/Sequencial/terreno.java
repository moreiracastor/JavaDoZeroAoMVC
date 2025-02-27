// Problema "terreno" 
// Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma 
// casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, 
// o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com 
// duas casas decimais, conforme exemplo. 

package Sequencial;

import java.util.Scanner;

public class terreno {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a largura: ");
        float largura = scan.nextFloat();

        System.out.print("Digite a altura: ");
        float altura = scan.nextFloat();

        System.out.print("Digite o valor do metro^2: ");
        float valorMetro = scan.nextFloat();

        scan.close();

        System.out.printf("Area do terreno: %.1f\nPreço do terreno: %.2f", calcArea(largura, altura), calcMetro(valorMetro, largura, altura));

    }

    public static float calcArea(float lado, float altura){
        float area = lado*altura;

        return area;
    }

    public static float calcMetro(float valorMetro,float lado, float altura ){
        float valor = calcArea(lado, altura)*valorMetro;

        return valor;
    }
}
