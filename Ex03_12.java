 public class Ex03_12 {
 
    private double balance;
 
    public Ex03_12 (double initialBalance) {
        if (initialBalance > 0.0) 
            balance = initialBalance;
    }
     
    public void credit (double amount) {
        balance = balance + amount;
    }
     
    public double getBalance () {
        return balance;
    }
     
    public void debit (double amount) {
        if (amount > balance)
            System.out.printf ("Debit amount exceeded account balance.\n");
        if (amount == balance)
            balance = balance - amount;
        if (amount < balance)
            balance = balance - amount;
    }
 
}