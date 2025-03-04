package ex001.aplication;// Calculo de areas de um triângulo

import ex001.entities.Triangulo;

import java.util.Scanner;

public class exp001 {
    public static void main(String[] args) {
        Triangulo y, x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os lados do Triângulo X: ");
        x = new Triangulo();
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite os lados do Triângulo Y: ");
        y = new Triangulo();
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        System.out.println("Área triângulo X: " + x.area());
        System.out.println("Área triângulo Y: " + y.area());

    }
}

