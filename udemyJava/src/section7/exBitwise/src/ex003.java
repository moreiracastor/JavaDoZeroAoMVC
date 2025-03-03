//Multiplicação e divisão por 2

public class ex003 {
    public static void main(String[] args) {
        System.out.println(mult(5)); // Move o bit uma casa pra direita, multiplica
        System.out.println(divi(10)); // Move um bit uma casa pra esquerda, divide
    }

    public static int mult(int num){
        return num << 1;
    }

    public static int divi(int num){
        return num >> 1;
    }
}
