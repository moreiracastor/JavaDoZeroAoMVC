package section8.Employee.Aplication;

import section8.Employee.Entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee colaborador = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee: ");
        colaborador.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        colaborador.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        colaborador.tax = sc.nextDouble();

        System.out.println("Employee data --> " + colaborador);

        System.out.print("Which percentage to increase salary? ");
        double test = sc.nextDouble();
        colaborador.increaseSalary(test);

        System.out.println("Update data --> " + colaborador);

    }
}
