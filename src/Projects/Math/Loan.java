package Projects.Math;

import java.util.Date;

public class Loan {
    private double annualInterestRate = 2.5;
    private int numberOfYears = 1;
    private double loanAmount = 1000;
    java.util.Date loanDate = new Date();

    public Loan(){}
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public int getNumberOfYears(){
        return numberOfYears;
    }
    public double getLoanAmount() {
        return loanAmount;
    }
    public void setAnnualInterestRate(){
        this.annualInterestRate = annualInterestRate;
    }
    public void setNumberOfYears(){
        this.numberOfYears = numberOfYears;
    }

    public double getMonthlyPayment(){
        return loanAmount * annualInterestRate / 12;
    }
    public double getTotalPayment(){
        return loanAmount * numberOfYears * annualInterestRate;
    }
}
