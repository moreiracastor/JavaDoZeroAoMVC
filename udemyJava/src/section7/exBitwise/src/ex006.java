// alternar o estado de uma variável

public class ex006 {
    public static void main(String[] args) {
        System.out.println(alternar(0));
    }

    public static int alternar(int num){
        return num ^ 1;
    }
}
