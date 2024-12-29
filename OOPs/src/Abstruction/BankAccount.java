package Abstruction;

abstract class BankAccount {
    public int AccountNumber;
    public int Balance;

    BankAccount(int accountNumber, int balance) {
        this.AccountNumber = accountNumber;
        this.Balance = balance;
    }

    abstract void depositMoney(int amount);

    abstract void withdrawMoney(int amount);

    public void getBalance() {
        System.out.println(Balance);
    }
}
