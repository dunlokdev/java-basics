package modules;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public Customer(String name, String customerID) {
        super(name, customerID);
        this.accounts = new ArrayList<>();
    }

    public boolean isPremium() {
        for (Account account : accounts) {
            if (account.isPremium()) {
                return true;
            }
        }
        return false;
    }

    public void addAccount(Account newAccount) {
        accounts.add(newAccount);

    }

    public double getBalance() {
        double kq = 0;
        for (Account account : accounts) {
            kq += account.getBalance();
        }
        return kq;
    }

    public void displayInformation() {
        String loaiKH = isPremium() ? "Premium" : "Normal";
        String s = getCustomerId() + "|     " + getName() + " | " + loaiKH + " | " + getBalance() + "đ\n";
        int i = 1;
        for (Account account : accounts) {
            s += String.valueOf(i) + "  " + account.toString() + "\n";
            i++;
        }
        System.out.println(s);
    }
}
