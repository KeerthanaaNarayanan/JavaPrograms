package com.company;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 87868, "Keerthanaa", "ken@gmail.com", "9238472878");
        account.getBalance();
        account.deposit(98799);
        account.getBalance();
        account.withdraw(186666);

        BankAccount account2 = new BankAccount();
        account2.getBalance();
        account2.deposit(98799);
        account2.getBalance();
        account2.withdraw(186666);

        BankAccount timsaccount = new BankAccount("tim", "tim@tim.com", "98739879");
        timsaccount.getBalance();
    }
}

