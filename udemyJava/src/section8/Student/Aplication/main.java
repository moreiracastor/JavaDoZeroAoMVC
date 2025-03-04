package section8.Student.Aplication;

import section8.Student.Entities.Student;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student estudante = new Student();

        System.out.print("Nome: ");
        estudante.name = sc.nextLine();

        System.out.print("1° Nota: ");
        estudante.n1 = sc.nextFloat();

        System.out.print("2° Nota: ");
        estudante.n2 = sc.nextFloat();

        System.out.print("3° Nota: ");
        estudante.n3 = sc.nextFloat();

        System.out.println(estudante.exame());
    }
}
