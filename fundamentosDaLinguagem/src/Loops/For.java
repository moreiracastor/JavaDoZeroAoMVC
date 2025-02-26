package Loops;

public class For {
    public static void main(String[] args){
        String[] nomes = {"Pedro", "Paulo", "João", "no", "Barquinho"};

        // For simples
        // for (int i = 1; i <= 10; i++){
        //     System.out.println("Contando: " +  i);
        // }

        // Percorrendo uma lista com o For
        // for(int i = 0; i < nomes.length; i++){
        //     System.out.println(nomes[i]);
        // }

        // Percorrendo uma lista com o shorthand do for
        for(String i : nomes){//    | for(tipo var : array){    |
            System.out.println(i);//|    System.out.println(i)  |
        }                       //  |}                          |
    }
}
