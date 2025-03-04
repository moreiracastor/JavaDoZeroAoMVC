package Aplication;

import Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Product" + product);

        System.out.print("\nEnter the number of products to be added in stock:  ");
        product.addProducts(sc.nextInt());

        System.out.println("Added --> " + product);

        System.out.print("\nEnter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());

        System.out.println("Removed --> " + product);

    }
}
