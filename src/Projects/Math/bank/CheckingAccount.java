package Projects.Math.bank;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }


    public CheckingAccount(int id, double balance, double annualInterestRate,
                           String dateCreated, double overdraftLimit) {
        super(id, balance, annualInterestRate, dateCreated);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < -overdraftLimit) {
            System.out.println("too much");
        } else {
            balance -= amount;
        }
    }
}

