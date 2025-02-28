// Código do livro Java para iniciantes - Oracle press

public class GalToLitTable {
    public static void main(String[] args) {
        double galoes, litros;
        int counter;
        
        counter = 0;
        for (galoes = 1; galoes <= 100; galoes++){
            litros = galoes * 3.7854;

            System.out.printf("%.0f Galão(s) = %.2f litros\n", galoes, litros);

            counter++;

            if(counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}