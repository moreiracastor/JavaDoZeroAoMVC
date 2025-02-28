// Crie uma tabela que mostre a conversão de pés para metros junto com a igualdade das mesmas

public class cap1Ex010 {
    public static void main(String[] args) {
        double pes, metros;
        int counter;

        counter = 0;
        for (pes = 1; pes <= 120; pes ++){
            metros = pes*0.3048;

            System.out.printf("%.0fft = %.2fm\n", pes, metros);

            counter ++;
            if(counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
