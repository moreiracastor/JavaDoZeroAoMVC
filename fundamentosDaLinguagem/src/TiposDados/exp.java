package TiposDados;

// Calcular a porcetagem que falta para completar o valor
public class exp {
    public static void main(Texto[] args){
        System.out.println(porcentagem(500, 300) + "%");
    }

    // Widening Casting 
    public static double porcentagem(int a, int b){
        double restante = b * 100.d /a;

        return restante;
    }
}
