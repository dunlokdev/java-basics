package modules;

public class DigitalBank extends Bank {
	/**
	 * Dùng để tìm khách hàng theo CCCD của khách hàng
	 *
	 * @param CCCD CCCD của khách hàng
	 * @return Chỉ trả về khách hàng nếu như tồn tại CCCD trong hệ thông ngân hàng,
	 *         ngược lại trả về null
	 */
	public Customer getCustomerById(String CCCD) {
		return null;
	}

	/**
	 * Dùng để tạo khách hàng cho ngân hàng
	 *
	 * @param customerId Căn cước công dân của khách hàng
	 * @param name       Tên của khách hàng
	 */
	public void addCustomer(String customerId, String name) {
		Customer newCustomer = new Customer(customerId, name);
		for (Customer customer : customers) {
			if (customerId.equals(customer.customerId)) {
				customers.add(newCustomer);
			}
		}
	}

	/**
	 * Dùng để cho phép khách hàng rút tiền theo tài khoản
	 *
	 * @param customerId
	 * @param accountNumber
	 * @param amount
	 */
	public void withdraw(String customerId, String accountNumber, double amount) {
		for (Customer customer : customers) {
			if (customerId.equals(customer.customerId)) {

			}
		}
	}
}
