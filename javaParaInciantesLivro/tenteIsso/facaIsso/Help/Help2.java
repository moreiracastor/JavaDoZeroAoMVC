package facaIsso.Help;

public class Help2 {
    public static void main(String[] args)
        throws java.io.IOException{
        char choice, ignore;

        do {
            System.out.println("Ajuda");
            System.out.println("1°) If\n \n2°) Switch\n \n3°) For\n 4°) For each\n \n5°)While \n 6°)Do While \n");

            System.out.print("Escolha uma: ");
            choice = (char) System.in.read();

            //Desnecessário
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

        } while (choice < '1' | choice > '6');

        switch (choice) {
            case '1':
                System.out.println("\nO condicional If:");
                System.out.println("if (condição) {caso Verdade}");
                System.out.println("else {caso Falso}\n");
                break;

            case '2':
                System.out.println("\nO condicional switch: ");
                System.out.println("switch(condição){Case 'condição 1': 'algoritmo' break; Case 'condição 2': 'algoritmo' break;");
                System.out.println("default: 'algoritmo' break;}\n");
                break;

            case '3':
                System.out.println("O For: \nfor(var; cond; incre/decre) {algoritmo}");
                break;

            case '4':
                System.out.println("O For each: \nfor (var ; arrayNome) {algoritmo}");
                break;

            case '5':
                System.out.println("O While \nwhile(condição) {algoritmo}");
                break;

            case '6':
                System.out.println("O Do While \nDo{algoritmo} while(condição)");
                break;

            default:
                System.out.println("Escolha não encontrada.");
                break;
        }
    }
}
