import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Account, Customer> customerAccountMap = new HashMap<>();
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);

        System.out.println("Welcome to the Banking App.\nPress anything to continue.");
        if (in.readLine().equalsIgnoreCase("")) {
            CustomerManager.modifyCustomer(customerAccountMap);
            customerAccountMap.forEach((key, value) -> {
                System.out.println(key + "\n" + "\n" + "Next Customer" + "\n" + "-----------" + "\n");
            });
        }
    }
}
