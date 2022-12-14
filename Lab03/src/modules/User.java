package modules;

public abstract class User {
	protected String name;
	protected String customerId;

	public User(String name, String custormerID) {
		this.name = name;
		this.customerId = custormerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String costumerId) {
		this.customerId = costumerId;
	}
}
