/*.
    Numa cidade se deseja sincronizar os semáforos. Com isto, quando um semáforo abre
    (fica verde), os veículos que nele estavam parados tendem a encontrar os próximos
    semáforos também abertos. Para que isto seja feito, os próximos semáforos precisam
    abrir um pouco depois, dependendo da velocidade permitida na via e da distância entre
    eles. Assim, ao abrir o semáforo, um veículo começa a acelerar até atingir a velocidade
    permitida, que mantém até chegar ao próximo semáforo, levando um certo tempo para
    percorrer essa distância. Para encontrar o próximo semáforo aberto, este deve abrir
    um pouco antes da chegada do veículo (por ex: 3 segundos antes). Faça assim um
    algoritmo que informe quanto tempo depois um semáforo deve abrir, dada as seguintes
    informações:
        a. a distância desde o semáforo anterior
        b. a velocidade permitida da via
        c. a aceleração típica dos carros
*/

package cemExJava;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) throws java.io.IOException{
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidadde da via: ");
        float velo = sc.nextFloat();

        System.out.print("Distância Semáforo: ");
        float dist = sc.nextFloat();

        System.out.printf("O Semáforo deve abrir em: %.2fs",tempAbertura(dist, velo));
    }

    public static double tempAbertura(float distSemaforo, float veloPermitida){
        float veloFinal = (veloPermitida * 1000) / 3600;
        double MUA = Math.pow(veloFinal, 2) / (distSemaforo * 2); // Equação de Torricelli
        double tempoFinal = veloFinal / MUA;

        return tempoFinal - 3;
    }
}
