//Verificação de números pares e ímpares

public class ex001 {
    public static void main(String[] args) {
        System.out.println(impar_ou_par(6));
        System.out.println(impar_ou_par(5));
    }

    private static String impar_ou_par(int i) {
        return ((i & 1) == 0) ? "Par": "Ímpar" ;
    }
}
