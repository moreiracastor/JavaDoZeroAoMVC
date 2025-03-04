//Escreva um programa para gerar o invertido de um número com três algarismos
//(exemplo: o invertido de 498 é 894).

package cemExJava;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String num;

        System.out.print("Digite um número: ");
        num = sc.nextLine();

        System.out.printf("Número original: %s \nNúmero invertido: %s", num, inverter(num));
    }

    public static String inverter(String num){
        String[] numList = num.split("");
        List<String> resultado = new ArrayList<>();
        String teste;

        for (int i = numList.length - 1; i >= 0; i--){
            resultado.add(numList[i]);
        }
        System.out.println();

        return String.join("", resultado);
    }
}
