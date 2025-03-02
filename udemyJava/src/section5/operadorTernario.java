package section5;

public class operadorTernario {
    public static void main(String[] args) {

        // Dá pra juntar operadores ternários
        @SuppressWarnings("unused")
        String teste = (10 == 8) ? "Não" : (10 < 0) ? "Sim" : "Não" ;

        System.out.println(teste);
    }
}
