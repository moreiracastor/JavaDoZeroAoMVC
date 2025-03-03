public class ex002 {
    // Inverções de variaveis

    public static void main(String[] args) {
        inversao(5, 3);
    }

    private static void inversao(int a, int b) {
        int C = a ^ b; // 0110(6)
        C ^= a; // 0011(3)

        int D = C ^ a; // 0110(6)
        D ^= b; // 0101(5)

        System.out.printf("A: %d --> A: %d \nB: %d --> B: %d", a, b, C, D);
    }
}
