package TiposDados;

public class Casting {
    public static void main(Texto[] args){
        System.out.println("Transformação de tipos de dados, tipo de var pequeno para um maior");

        System.out.println("Widening Casting (alteração da var automática)");
        wideningCasting();

        System.out.println("Narrowing Casting (alteração manual do valor)");
        narrowingCasting();
    }

    public static void wideningCasting(){
        int numSort = 13;
        double myDouble = numSort;

        System.out.println(numSort + " --> int, var pura");
        System.out.println(myDouble + " --> double, var alterado automáticamente");
    }

    public static void narrowingCasting(){
        double myDouble = 3.14d;
        int myInt = (int) myDouble;

        System.out.println(myDouble + " --> double, var pura");
        System.out.println(myInt + " --> int, var alterado manualmente");
    }
}
