package Projects.Math.bank;

public class Account {
    private int Id;
    protected double balance;
    private double interestRate;
    private String dateCreated;

    public String getDateCreated() {
        return dateCreated;
    }
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public Account(int id, double balance, double interestRate, String dateCreated) {}

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
