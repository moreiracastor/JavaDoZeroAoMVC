// Verificar se um número é potência de dois

public class ex004 {
    public static void main(String[] args) {
        System.out.println(pot(15));
    }

    public static String pot(int num){
        return ((num & (num - 1)) == 0) ? "Potência de Dois" : "Não é uma Potência de Dois." ;
    }
}
