package sequencial;

import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
        int x, y, soma;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        x = scan.nextInt();

        System.out.print("Digite o 2° número: ");
        y = scan.nextInt();

        scan.close();

        soma = x+y;

        System.out.printf("A soma de %d e %d é %d", x, y, soma);
    }
}
