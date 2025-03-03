package facaIsso.Help;

public class Help   {
    public static void main(String[] args)
        throws java.io.IOException{
        char choice;

        System.out.println("Ajuda");
        System.out.println("1°) If \n2°) Switch");

        System.out.print("Escolha uma: ");
        choice = (char) System.in.read();

        switch (choice){
            case '1':
                System.out.println("\nO condicional If:");
                System.out.println("if (condição) {\n   caso verdade    \n}");
                System.out.println("else {\n  caso falso  \n}");
                break;

            case '2':
                System.out.println("\nO condicional switch: ");
                System.out.println("switch(condição){\n Case 'condição 1':\n    algoritmo\n break; \n Case 'condição 2':\n    algoritmo\n break;");
                System.out.println("    default:\n      caso nenhum caso for satisfeito\n   break;\n}");
                break;
            default:
                System.out.println("Escolha não encontrada.");
                break;
        }
    }
}
