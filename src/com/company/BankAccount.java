package com.company;

public class BankAccount {
    private String accountNumber;
    private int balance;
    private String name;
    private String email;
    private String phone;

    public BankAccount(){
        this("34567", 76576, "hariprasath", "hari@hari.com", "879874534");
        System.out.println("empty constructor called");
    }

    public BankAccount(String accountNumber, int balance, String name, String email, String phone){
        this.accountNumber = accountNumber;
        this.balance = balance;
        setName(name);
        this.email = email;
        this.phone = phone;
    }

    public BankAccount(String name, String email, String phone) {
        this("45353453", 45343, name, email, phone);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }

    public void deposit(int new_deposit){
        this.balance = this.balance + new_deposit;
        System.out.println("Deposit complete, your balance is " + this.balance);
    }

    public void withdraw(int new_withdrawal) {
        if (this.balance < new_withdrawal) {
            System.out.println("Withdrawal not possible, low balance");
        } else {
            this.balance = this.balance - new_withdrawal;
            System.out.println("Withdrawal complete, your balance is " + this.balance);
        }
    }
}
