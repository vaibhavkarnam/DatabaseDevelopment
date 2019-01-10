package JDBC.model;

/**
 * The Class Address.
 */
public class Address {
	
	/** The street 1. */
	private String street1;
	
	/** The street 2. */
	private String street2;
	
	/** The city. */
	private String city;
	
	/** The state. */
	private String state;
	
	/** The zip. */
	private String zip;
	
	/** The primary. */
	private Boolean primary;
	
	/**
	 * Instantiates a new address.
	 */
	public Address() {
		super();
	}
	
	/**
	 * Instantiates a new address.
	 *
	 * @param street1 the street 1
	 * @param street2 the street 2
	 * @param city the city
	 * @param state the state
	 * @param zip the zip
	 * @param primary the primary
	 */
	public Address(String street1, String street2, String city, String state, String zip, Boolean primary) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.primary = primary;
	}
	
	/**
	 * Gets the street 1.
	 *
	 * @return the street 1
	 */
	public String getStreet1() {
		return street1;
	}
	
	/**
	 * Sets the street 1.
	 *
	 * @param street1 the new street 1
	 */
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	
	/**
	 * Gets the street 2.
	 *
	 * @return the street 2
	 */
	public String getStreet2() {
		return street2;
	}
	
	/**
	 * Sets the street 2.
	 *
	 * @param street2 the new street 2
	 */
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the state.
	 *
	 * @param state the new state
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	
	/**
	 * Sets the zip.
	 *
	 * @param zip the new zip
	 */
	public void setZip(String zip) {
		this.zip = zip;
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

}
