package section8.Bank.Entities;

import java.awt.image.BandCombineOp;

public class BankAccount extends User {

    private String nameAccount;
    private String accountId;
    private float balance;

    //Metodo construtor
    public BankAccount(String name, String cep, String cpf, String nameAccount, String accountId, float balance){
        super(name, cep, cpf);
        this.nameAccount = nameAccount;
        this.accountId = accountId;
        this.balance = balance;

    }

    public BankAccount(){
    }

    //Getters
    public String getNameAccount() {
        return nameAccount;
    }

    public String getAccountId() {
        return accountId;
    }

    public float getBalance() {
        return balance;
    }

    //Set
    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    //Métodos
    public String toString() {
        return nameAccount + " - " + accountId + " - " + balance;
    }

    public void cashWithdrawal(float withdrawal){
        this.balance -= withdrawal + 5;//$5 de taxa
    }

    public void depositMoney(float deposit){
        this.balance += deposit;
    }
}
