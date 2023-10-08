import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String pin;
    private double deposit;
    private Map<Account,Account> accountMap = new HashMap<>();

    Account customerAccountNumber;
    Account customerAccountBalance;

    public Customer(){
    };
    public Customer(String firstName, String lastName, String dateOfBirth, String pin, Account customerAccountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.pin = pin;
        this.customerAccountNumber = customerAccountNumber;
    }

    public Customer(String firstName, String lastName, String dateOfBirth, String pin, Account customerAccountBalance ,Account customerAccountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.pin = pin;
        this.customerAccountNumber = customerAccountNumber;
        this.customerAccountBalance = customerAccountBalance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }





    @Override
    public String toString() {
        return "Customer" + '\n' +
                "First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Date Of Birth: " + dateOfBirth + '\n' +
                "Pin: " + pin + '\n' +
                "Customer Account Number: " + customerAccountNumber.toString() + '\n';
    }
}
