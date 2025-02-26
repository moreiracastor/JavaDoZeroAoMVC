package TiposDados;

public class Texto {
    public static void main(String[] args) {
        testes();
    }

    public static void testes(){
        String nome = " João Pedro";

        System.out.printf("%s String pura\n", nome);
        System.out.printf("%s String em Caps\n", nome.toUpperCase());
        System.out.printf("%s String minus\n", nome.toLowerCase());
        System.out.printf("%s String repetida 7 vezes\n", nome.repeat(7));
        System.out.printf("%s String em char Array(seja o que for isso)", nome.toCharArray());
    }
}
