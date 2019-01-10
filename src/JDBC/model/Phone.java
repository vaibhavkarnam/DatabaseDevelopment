package JDBC.model;

/**
 * The Class Phone.
 */
public class Phone {
	
	/** The phone. */
	private String phone;
	
	/** The primary. */
	private Boolean primary;
	
	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * Sets the phone.
	 *
	 * @param phone the new phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * Gets the primary.
	 *
	 * @return the primary
	 */
	public Boolean getPrimary() {
		return primary;
	}
	
	/**
	 * Sets the primary.
	 *
	 * @param primary the new primary
	 */
	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}
	
	/**
	 * Instantiates a new phone.
	 *
	 * @param phone the phone
	 * @param primary the primary
	 */
	public Phone(String phone, Boolean primary) {
		super();
		this.phone = phone;
		this.primary = primary;
	}
	
	/**
	 * Instantiates a new phone.
	 */
	public Phone() {
		super();
	}
	

}
