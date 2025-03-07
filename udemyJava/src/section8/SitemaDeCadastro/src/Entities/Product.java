package Entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    //Construtor da classe
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Sobrecarga
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    //Construtor sem parâmetros
    public Product(){
    }

    //Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //Métodos
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    //Visualização do objeto em String
    public String toString(){
        return name
                + ", "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
}
