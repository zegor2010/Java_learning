package Test.Math;

import Projects.Math.Loan;

public class LoanTest {
  public static void main(String[] args) {
    Loan loan = new Loan();
    Loan customerLoan = new Loan(2.5, 3, 10000);
    System.out.println(customerLoan.getLoanAmount());
  }

}
