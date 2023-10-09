import java.util.*;

public class Account {
    private double customerAccountBalance;
    private long customerAccountNumber;
    private String debitCard;

    public Account() {
    }

    public void setInitialDeposit(double deposit){
        customerAccountBalance = deposit;
    }

    public double getCustomerAccountBalance() {
        return customerAccountBalance;
    }

    public double addFunds(double deposit){
        customerAccountBalance += deposit;
        return customerAccountBalance;
    }

    public double withdraw(double withdrawAmount){
        customerAccountBalance -= withdrawAmount;
        return customerAccountBalance;
    }

    public void setCustomerAccountBalance(double amount) {
        customerAccountBalance += amount;
    }

    public double getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setCustomerAccountNumber() {
       Random rand = new Random();
       long accountNumber = rand.nextInt(1000000,9999999);
       this.customerAccountNumber = accountNumber;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return " " + customerAccountNumber;
    }
}
