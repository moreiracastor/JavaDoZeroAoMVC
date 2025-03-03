package javaMetodos;

public class recursao {
    public static void main(String[] args){
        System.out.println(soma(3)); // Soma de todos números até o 10
        System.out.println(fatorial(6)); // Fatorial usando Recursividade
    }
    // Visualização -
    public static int soma(int num){
        // Bloco que será execuçao
        if (num > 0){
            return  num + soma(num - 1);
        } else{
            return 0;
        }
    }

    public static int fatorial(int num){
        if (num > 1){
            return num * fatorial(num - 1);
        } else{
            return num;
        }
    }
    
}
