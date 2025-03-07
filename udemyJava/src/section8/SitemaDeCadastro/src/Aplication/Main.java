package Aplication;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Product" + product);

        System.out.print("\nEnter the number of products to be added in stock:  ");
        product.addProducts(sc.nextInt());

        System.out.println("Added --> " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println("Removed --> " + product);

        System.out.println("Name \t Qtd. \t Price");
        System.out.printf("%s \t %d \t %.2f \t", product.getName(), product.getQuantity(), product.getPrice());

    }
}
