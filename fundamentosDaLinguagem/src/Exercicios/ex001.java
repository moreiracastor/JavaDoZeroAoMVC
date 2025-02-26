// Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu perímetro.
package Exercicios;

import java.util.Scanner;

public class ex001 {
   public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);    

        System.out.print("Digite a base do triângulo: ");
        float base = scan.nextFloat();

        System.out.print("Digite a altura: ");
        float altura = scan.nextFloat();
        
        scan.close();

        calcTrig(base, altura);
   }

   public static void calcTrig(float base, float altura){
        float area = base * altura / 2;
        float perimetro = 3 * base;

        System.out.printf("Area: %.2f\nPerimetro: %.2f", area, perimetro);
   }
}   
