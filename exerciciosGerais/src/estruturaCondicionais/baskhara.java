/*
    Problema "baskara"
    Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
    de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
    conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.
*/

/*
 * Casos
 * delta > 0 ==> Duas raíz reais
 * delta == 0 ==> Uma raíz real
 * dekta < 0 ==> Nenhuma raíz real
 */

package estruturaCondicionais;

import java.util.Scanner;

public class baskhara {
    public static void main(String[] args) {
        double raiz1, raiz2, raizDupla, delta;
        float coeA, coeB, coeC;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o coeficiente A: ");
        coeA = scan.nextFloat();

        System.out.print("Digite o coeficiente B: ");
        coeB = scan.nextFloat();

        System.out.print("Digite o coeficiente C: ");
        coeC = scan.nextFloat();

        scan.close();

        delta = Math.pow(coeB, 2) - 4 * coeA * coeC;

        if (delta == 0){
            raizDupla = -coeB/(2*coeA);

            System.out.printf("\nEsse cálculo possue uma raíz dupla %.2f\n", raizDupla);
        } else if(delta > 0){
            raiz1 = (-coeB + Math.sqrt(delta)) / (2 * coeA);
            raiz2 = (-coeB - Math.sqrt(delta)) / (2 * coeA);

            System.out.printf("Esse cálculo possue duas raízes \n1°) Raíz: %.2f \n2°) Raíz: %.2f\n", raiz1, raiz2);
        } else{
            System.out.println("Esse cálculo não possue raízes reais.");
        }
    }    
}
