//Conta os bits 1 de um número

public class ex005 {
    public static void main(String[] args) {
        System.out.println(cont1(7));

    }

    //Hamming weight
    public static int cont1(int num) {
        int count = 0;

        while (num != 0){
            num ^= (num - 1);

            count++;
        }

        return count;
    }
}
