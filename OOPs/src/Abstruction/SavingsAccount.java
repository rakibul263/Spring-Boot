package Abstruction;

public class SavingsAccount extends BankAccount {
    SavingsAccount(int AccountNumber, int balance) {
        super(AccountNumber, balance);
    }

    public void depositMoney(int amount) {
        Balance+=amount;
        System.out.println("Balance: "+Balance);
    }

    public void withdrawMoney(int amount) {
        Balance-=amount;
        System.out.println("Balance: "+Balance);
    }

    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1263, 100);
        savingsAccount.depositMoney(200);
        savingsAccount.withdrawMoney(50);
    }
}
