public class chart {
    public static void main(String[] args) {
        char z = 'Z';
        int count;
        /* 
        System.out.println(z);
        z++;
        System.out.println(z);
        z++;
        System.out.println(z);
        */

        // Manipulação de char
        count = 0;
        for (int x = 0; x <= 100; x++){
            System.out.printf("Adicionando 1 a %c resultado é %c\n", z, z++);

            count ++;
            if(count == 10){
                System.out.println();
                count = 0;
            }
        }

        //Cada incremento altera o valor da char com base na ASCII e assim modifica o caracteres
    }
}
