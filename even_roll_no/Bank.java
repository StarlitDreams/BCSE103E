package even_roll_no;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Integer, Customer> customers;

    public Bank() {
        this.customers = new HashMap<>();
    }

    public Customer addCustomer(String name) {
        Customer newCustomer = new Customer(name);
        customers.put(newCustomer.getCustomerId(), newCustomer);
        return newCustomer;
    }

    public Customer getCustomer(int customerId) {
        return customers.get(customerId);
    }

    public Map<Integer, Customer> getAllCustomers() {
        return customers;
    }
}
