import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String pin;
    private String nameOnCard;
    private String fullName;
    List<String> DebitCard = new ArrayList<>();

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = getFirstName() + " " + getLastName();
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


    public List<String> createDebitCard(String nameOnCard){
        this.nameOnCard = fullName;
        Random rand = new Random();
        int digits = 9251;
        int digits1 = rand.nextInt(0,9999);
        int digits2 = rand.nextInt(0,9999);
        int digits3 = rand.nextInt(0,9999);
        StringBuilder builder = new StringBuilder();
        builder.append(digits + "-" + digits1 + "-" + digits2 + "-" + digits3);

        String customerCardNumber = builder.toString();


        Random rand2 = new Random();
        String month = String.valueOf(rand2.nextInt(01,12));
        String year = String.valueOf(rand2.nextInt(27,30));

        StringBuilder expBuilder = new StringBuilder();
        expBuilder.append(month + "/" + year);


        String customerCardExpDate = expBuilder.toString();
        Random rand3 = new Random();
        String cvvDigits = String.valueOf(rand3.nextInt(000,999));
        StringBuilder cvvBuilder = new StringBuilder();
        cvvBuilder.append(cvvDigits);
        String customerCVV = cvvBuilder.toString();

        StringBuilder totalCard = new StringBuilder();
        totalCard.append("Name On Card: " + firstName + " " + lastName +"\n" + "Card Number: " + customerCardNumber + "\n" +
                "Expiration Date: " + customerCardExpDate + "\n" + "cvv: " + customerCVV + " ");
        DebitCard.add(totalCard.toString());
        return DebitCard;
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
