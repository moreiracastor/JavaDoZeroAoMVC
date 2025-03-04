/*.
    Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é
    suficientemente longa. Assumindo que seja possível medir sua sombra e a do prédio no
    chão, e que você lembre da sua altura, faça um programa para ler os dados necessários e
    calcular a altura do prédio.
*/

package cemExJava;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho da sombra do prédio: ");
        float dist = sc.nextFloat();

        System.out.print("Altura da pessoa: ");
        float alturaPessoa = sc.nextFloat();

        System.out.print("Tamanho da sombra da pessoa: ");
        float sombraPessoa = sc.nextFloat();

        System.out.printf("Altura do prédio: %.2fm", calcAltura(dist, alturaPessoa, sombraPessoa));
    }

    public static double calcAltura(float dist, float alturaPessoa, float sombraPessoa){
        double altura = (alturaPessoa * dist) / sombraPessoa;

        return altura;
    }
}
