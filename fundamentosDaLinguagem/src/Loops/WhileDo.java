package Loops;

public class WhileDo {
    public static void main(String[] args){
        String[] musica = {"Eu", "qro", "Tchu", "Eu", "qro", "Tcha"};
        int i = 0;

        do{
            System.out.println(musica[i]);
            i++;
        } while(i < musica.length);
    }
}
