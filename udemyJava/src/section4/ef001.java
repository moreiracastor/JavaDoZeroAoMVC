package section4;

import java.util.Locale;

public class ef001{
    public static void main(String[] args) {
        String product1 = "Computer", product2 = "Office desk";
        char gender = 'F';

        int age = 30, code = 5290;

        double price1 = 2100.0d, price2 = 650.50d, measure = 53.23234567d;

        System.out.printf("Product: \n%s, with price is $%.2f \n%s, with price is $%.2f", product1, price1, product2, price2);

        System.out.printf("\nRecord: %d years old, code %d and gender %c\n\n", age, code, gender);

        System.out.printf("Measure with eight decimal places %.8f\n", measure);
        System.out.printf("Rounde (three decimal places): %.3f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.2f\n\n", measure);

        
    }
}