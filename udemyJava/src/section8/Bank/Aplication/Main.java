package section8.Bank.Aplication;

import section8.Bank.Entities.BankAccount;
import section8.Bank.Entities.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        BankAccount account = new BankAccount();

        char request;
        float deposit;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        user.setName(sc.nextLine());
        account.setNameAccount(user.getName());

        System.out.print("Enter Account Number: ");
        account.setAccountId(sc.nextLine());

        System.out.print("Is there na initial deposit(y/n): ");
        request = sc.next().charAt(0);

        if (request == 'y'){
            System.out.print("Enter initial deposit value: ");
            account.depositMoney(sc.nextFloat());
        }


        System.out.printf("\nAccount Holder: %s \nAccount Id: %s \nBalance: %.2f\n", account.getNameAccount(), account.getAccountId(), account.getBalance());

        System.out.print("\nMake withdrawal(y/n): ");
        request = sc.next().charAt(0);

        if (request == 'y'){
            System.out.print("Enter withdrawal value: ");
            account.cashWithdrawal(sc.nextFloat());
        }

        System.out.println("\n" + account);

        System.out.println("Programa finalizado");
    }
}
