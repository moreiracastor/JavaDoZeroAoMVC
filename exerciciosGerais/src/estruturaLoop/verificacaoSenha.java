package estruturaLoop;

import java.util.Scanner;

public class verificacaoSenha {
    public static void main(String[] args) {
        int senha, verifica;
        
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite sua senha: ");
        senha = sc.nextInt();

        System.out.printf("Confirme: ");
        verifica = sc.nextInt();

        while(senha != verifica){
            System.out.print("Senha errada, tente novamente.");
            
            System.out.printf("\nConfirme: ");
            verifica = sc.nextInt();

        }

        sc.close();

        System.out.println("Acesso garantido.");
    }
}
