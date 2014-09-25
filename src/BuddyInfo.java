
public class BuddyInfo {
	 private String name;
	 private String address; 
	 private String phoneNumber;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getFullInfo()
	{
		return "Name: " + this.name + " Address: " + this.address + " Number: " + this.number;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BuddyInfo(String name, String phoneNumber, String address)
	{
		
		this.setName(name);
		this.setPhoneNumber(phoneNumber);
		this.setAddress(address);
		
	}


}
