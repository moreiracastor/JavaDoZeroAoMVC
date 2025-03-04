package section8.Retangulo.Aplication;

import section8.Retangulo.Entities.Retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height: ");
        ret.height = sc.nextDouble();

        System.out.print("Enter the width: ");
        ret.width = sc.nextDouble();

        System.out.print(ret);
    }
}
