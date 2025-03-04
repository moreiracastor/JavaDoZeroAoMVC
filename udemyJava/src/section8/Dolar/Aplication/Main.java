package section8.Dolar.Aplication;

import section8.Dolar.Util.Convert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        float dollar = sc.nextFloat();

        System.out.print("How many dollars will be bought: ");
        int quantity = sc.nextInt();

        float result = Convert.convert(dollar, quantity);

        System.out.println("Amount to be paid in reais: " + result);
    }
}
