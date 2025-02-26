package TiposDados;
public class Variavel {

    public static void main(Texto[] args){
        tipos();
        matrix();
    }

    // Tipos de variaveis principais
    public static void tipos(){
        // TEMOS que dizer o tipo de variavel sempre
        int x = 40; // Tipo Primitivo
        int y = 50; 
        String nome = "João"; // Tipo não primitivo
        double divisao = (float) x/y; // "Casting" garante que a divisão seja feita com ponto flutuante, o double tem o dobro de casas decimais que o float
        boolean check = x > y;
        boolean check2 = x == y;


        // System.out.printf("A soma de %d e %d é %d ", x, y, x + y);
        System.out.printf("Olá, %s, a soma dos dados recebidos, %d e %d, é igual a %d", nome, x, y, x + y);

        System.out.printf("\nA divisão de %d por %d é igual %.2f\n", x, y, divisao);

        System.out.printf("%d > %d --> %b \n", x, y, check);

        System.out.printf("%d = %d --> %b\n", x, y, check2);
    }

    // Lista em Java
    public static void matrix(){
        int[] num = {1, 2, 3, 4, 5}; // Unidimensional
        int[][] nuns = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12}}; // Multimensional

        System.out.printf("Primeiro elemento do array %d\n", num[0]);

        System.out.printf("Tamanho do array: %d\n", num.length);

        System.out.printf("Primeiro elemento do segundo conjunto do array multi --> %d\n",  nuns[1][0]);

        System.out.printf("Terceiro elemento do terceiro conjunto do array multi --> %d\n", nuns[2][2]);
        // Tipo wrapper
    }
}
