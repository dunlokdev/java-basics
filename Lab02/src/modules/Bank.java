package modules;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Bank {
    private String id;
    private List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
        this.id = String.valueOf(UUID.randomUUID());
    }

    public String getId() {
        return id;
    }

    public boolean addCustomer(Customer newCustomer) {
        if (isCustomerExisted(newCustomer.getCustomerId())) {
            return false;
        }
        customers.add(newCustomer);
        return true;
    }

    public boolean addAccount(String customerId, Account account) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                for (Account ac : customer.getAccounts()) {
                    if (ac.getAccountNumber().equals(account.getAccountNumber())) {
                        return false;
                    }
                }
                customer.addAccount(account);
                return true;
            }
        }
        return false;
    }

    private boolean isCustomerExisted(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) {
                return true;
            }
        }
        return false;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}
