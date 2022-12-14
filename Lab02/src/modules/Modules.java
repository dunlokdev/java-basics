package modules;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Modules {
    private static final Bank bank = new Bank();

    public static Scanner sc = new Scanner(System.in);

    public void chucNang1() {

        String tenKH = ktTenKH();
        String cccd;
        while (true) {
            System.out.print("Nhap CCCD: ");
            cccd = sc.next();
            if (cccd.equals("No"))
                return;
            if (cccd.length() >= 12 || cccd.isEmpty()) {

                break;
            }
            System.out.println("So CCCD khong hop le. Vui long nhap lai hoac 'No' de thoat!");
        }

        bank.addCustomer(new Customer(tenKH, cccd));

    }

    private String ktTenKH() {
        String ten;
        sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap ten khach hang:");
            ten = sc.nextLine();
            if (!ten.isEmpty()) {
                return ten;
            }
        }
    }

    public void chucNang2() {
        String cccd = ktCCD().getCustomerId();
        String stk = ktSTK();
        Double soDu = ktSoDu();
        boolean themtk = bank.addAccount(cccd, new Account(stk, soDu));
        if (themtk) {
            System.out.println("Them thanh cong");
        } else {
            System.out.println("tai khoan khach hang da ton tai!!!");
        }

    }

    private Double ktSoDu() {
        double soDu;
        sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap so du:");
            soDu = sc.nextDouble();
            if (soDu >= 50000) {
                return soDu;
            }
            System.out.println("So du tai khoan khong duoc nho hon 50,000d");
        }
    }

    private String ktSTK() {
        String stk;
        sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap ma STK gom 6 chu so:");

            stk = sc.next();
            if (stk.length() == 6 && stk.matches(".*\\d.*")) {
                return stk;
            }
            System.out.println("So tai khoan khong hop le vui long nhap lai");
        }

    }

    private Customer ktCCD() {
        String cccd;
        sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap CCCD cua khach hang:");
            cccd = sc.next();
            for (var customer : bank.getCustomers()) {
                if (customer.getCustomerId().equals(cccd))
                    return customer;
            }
            System.out.println("So CCCD khong ton tai Vui long nhap lai");
        }
    }

    public void chucNang3() {
        for (var customer : bank.getCustomers()) {
            customer.displayInformation();
        }
    }

    public void chucNang4() {
        var cccd = ktCCD();
        cccd.displayInformation();
    }

    public void chucNang5(String name) {
        var result = findCustomerForName(name);
        for (Customer customer : result) {
            customer.displayInformation();
        }
    }

    public List<Customer> findCustomerForName(String name) {
        List<Customer> newList = new ArrayList<Customer>();
        for (var customer : bank.getCustomers()) {
            if (customer.getName().contains(name)) {
                newList.add(customer);
            }
        }
        return newList;
    }

}
