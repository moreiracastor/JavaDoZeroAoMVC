package Loops;

public class While {
    public static void main(String[] args){
        String[] comida = {"1", "2", "Feijão com Arroz", "3", "4", "Feijão no prato"};
        int i = 0;

        while(i < comida.length){
            System.out.println(comida[i]);
            i++;
        }
    }
}
