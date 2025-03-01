/*
    Problema "notas"
    Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de
    uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no
    ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a
    mensagem "REPROVADO", conforme exemplos 
*/

package estruturaCondicionais;

import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        float notaSemestre1, notaSemestre2, mediaNotas;
        String nome;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        nome = scan.nextLine();

        System.out.print("Digita a nota do 1° semestre: ");
        notaSemestre1 = scan.nextFloat();

        System.out.print("Digite a nota do 2° semestre: ");
        notaSemestre2 = scan.nextFloat();

        scan.close();

        mediaNotas = (notaSemestre1 + notaSemestre2) / 2F;

        if(mediaNotas >= 60){
            System.out.printf("\nAprovado!! Nota superior (ou igual) a 60 pontos \nO aluno %s teve a média de notas de %.1f\n", nome, mediaNotas);
        } else{
            System.out.printf("\nReprovado, Nota inferior a 60 pontos \nO aluno %s teve a média de notas de %.1f\n", nome, mediaNotas);
        }
    }  
}
