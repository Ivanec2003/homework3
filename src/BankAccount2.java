public class BankAccount2 {
    private double balance;
    private final int numberAccount;
    private final String owner;

    public BankAccount2(double balance, int numberAccount, String owner){
        this.balance = balance;
        this.numberAccount = numberAccount;
        this.owner = owner;
    }
    public void replenishmentBalance(int sumReplenishment){
        this.balance += sumReplenishment;
    }
    public void withdrawals(double amount){
        this.balance -=amount;
    }
    public void printBalance(){
        System.out.println("Owner: " + owner);
        System.out.println("Number of score: " + numberAccount);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------");
    }

}
