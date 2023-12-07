public class Account {
    private double balance;

//    Set balance to 0.00
    public Account() {
        balance = 0.0;
    }

//    Deposit
    public void deposit(double amount) {
        balance = balance + amount;

    }

//    Withdraw
    public void withraw(double amount){
        if (amount<=balance){
          balance = balance - amount;
        }
        else {
            System.out.println("Tranction cancelled due insufficient funds ");
        }
    }

//    Get Balance
    public double getBalance() {
        return balance;
    }
}
