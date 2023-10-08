import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Map;

public class CustomerManager {
    public static void modifyCustomer(Map<Account, Customer> customerAccountMap) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String firstName, lastName, dob, pin, deposit,withdraw;
        String input = null;
        while (true) {
            System.out.println("Please enter an action: Create Customer , Deposit from Account , Withdraw from Account");
            input = in.readLine();

            switch (input) {
               case "Create Customer": {

                   System.out.print("First Name: ");
                   firstName = in.readLine();


                   System.out.print("Last Name: ");
                   lastName = in.readLine();


                   System.out.print("Date of Birth: ");
                   dob = in.readLine();


                   System.out.print("Enter a Pin: ");
                   pin = in.readLine();


                   System.out.print("Initial Deposit: ");
                   deposit = in.readLine();


                   Account accountNumber = new Account();
                   accountNumber.setCustomerAccountNumber();
                   Account accountBalance = new Account();
                   accountBalance.setCustomerAccountBalance(Double.parseDouble(deposit));

                   Customer newCustomer = new Customer(firstName, lastName, dob, pin, accountBalance, accountNumber);
                   customerAccountMap.put(accountNumber, newCustomer);

                   System.out.println();
                   customerAccountMap.forEach((key,value) -> {
                       if(key.equals(accountNumber)){
                           System.out.print(value);
                       }
                       System.out.println();
                   });
                   break;
               }
               case "Deposit" : {
                   System.out.println("Enter account number: ");
                   String accountNum = in.readLine();
                   Customer currentCustomer = null;
                   Double.parseDouble(accountNum);
                   for (Account account : customerAccountMap.keySet()) {
                       if (account.getCustomerAccountNumber() == Long.parseLong(accountNum)) {
                           currentCustomer = customerAccountMap.get(account);
                           break;
                       }
                   }
                   if (currentCustomer != null) {
                       System.out.println("How much would you like to add? ");
                       deposit = in.readLine();
                       currentCustomer.customerAccountBalance.addFunds(Double.parseDouble(deposit));
                       System.out.print("The account balance for " + currentCustomer.getFirstName() + " " + currentCustomer.getLastName() +" is " + Math.round(currentCustomer.customerAccountBalance.getCustomerAccountBalance()) + "$");
                       System.out.println();

                       customerAccountMap.forEach((key,value) -> {
                           if(key.equals(Long.parseLong(accountNum)))
                               System.out.print(value);
                       });

                   } else {
                       System.out.println("Customer with this account number does not exist.");
                   }
                   break;

               }
               case "Withdraw" : {
                   System.out.println("Enter account number: ");
                   String accountNum = in.readLine();
                   Customer currentCustomer = null;
                   for (Account account : customerAccountMap.keySet()) {
                       if (account.getCustomerAccountNumber() == Long.parseLong(accountNum)) {
                           currentCustomer = customerAccountMap.get(account);
                           break;
                       }
                   }
                   if (currentCustomer != null) {
                       System.out.println("How much would you like to withdraw? ");
                       withdraw = in.readLine();
                       currentCustomer.customerAccountBalance.withdraw(Double.parseDouble(withdraw));
                       System.out.print("The account balance for " + currentCustomer.getFirstName() + " " + currentCustomer.getLastName() +" is " + Math.round(currentCustomer.customerAccountBalance.getCustomerAccountBalance()) + "$");
                       System.out.println();

                       customerAccountMap.forEach((key,value) -> {
                           if(key.equals(Long.parseLong(accountNum)))
                           System.out.print(key + " " + value);
                       });
                   } else {
                       System.out.println("Customer with this account number does not exist.");
                   }
                   break;
               }
           }

        }
    }
}

