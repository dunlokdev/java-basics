package modules;

import java.util.Scanner;

public class Modules_3 {
	private static final int EXIT_COMMAND_CODE = 0;
	private static final int EXIT_ERROR_CODE = -1;
	private static final Scanner scanner = new Scanner(System.in);
	private static final DigitalBank activeBank = new DigitalBank();
	private static final String CUSTOMER_ID = "2011042";
	private static final String CUSTOMER_NAME = "Duong My Loc";

	public void chucNang1() {

	}

	public void showCustomer() {
		Customer customer = activeBank.getCustomerById(CUSTOMER_ID);
		if (customer != null) {
			customer.displayInformation();
		}
	}

	public void chucNang2() {
	}

	public void chucNang3() {
	}

	public void chucNang4() {
	}

	public void chucNang5(String name) {
	}

}