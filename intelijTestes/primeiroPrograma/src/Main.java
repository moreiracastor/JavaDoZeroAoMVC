public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo");

        System.out.println(soma(30,60));

        System.out.println(fatorial(6));

        // Testando o retorno de multiplos valores
        String str = "";
        InfoString info = trabString(str);

        System.out.println("Maiuscula: " + info.maisc);
        System.out.println("Minuscula: " + info.minsc);
        System.out.println("Tamanho: " + info.thm);
        System.out.println("Vazio: " + info.empty);

        System.out.println("Maior de Três números: " + maior(0, 0, 1));
    }


    public static int soma(int a, int b){
        int somar = a + b;

        return somar;
    }

    public static int fatorial(int a){
        if (a == 0){
            return 1;
        }

        return a * fatorial(a - 1);
    }

    public static InfoString trabString(String str){
        String test1, test2, test5;
        int test3;
        boolean test4, vazio = str.isEmpty();

        //Verifica se a string está vazia, se sim imprime somente Vazio, se não executa a função
        test1 = (vazio) ? "Vazio" : str.toLowerCase();
        test2 = (vazio) ? "Vazio" : str.toUpperCase();

        test3 = (vazio) ? 0 : str.length();
        test4 = str.isEmpty();

        return new InfoString(test1, test2, test3, test4);
    }

    public static int maior(int a, int b, int c){
        if (a > b && a > c){
            return a;
        } else if(b > c && b > a){
            return b;
        } else if(c > b && c > a){
            return c;
        }

        return a;
    }
}

class InfoString {
    String minsc, maisc;
    int thm;
    boolean empty;

    public InfoString(String minsc, String maisc, int thm, boolean empty){
        this.minsc = minsc;
        this.maisc = maisc;
        this.thm = thm;
        this.empty = empty;
    }
}