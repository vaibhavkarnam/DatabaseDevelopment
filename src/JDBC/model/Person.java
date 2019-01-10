package JDBC.model;

import java.sql.Date;

/**
 * The Class Person.
 */
public class Person {
	
	/**
	 * Instantiates a new person.
	 */
	public Person() {
		super();
	}

	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/** The email. */
	private String email;
	
	/** The dob. */
	private Date dob;

	/**
	 * Instantiates a new person.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 * @param email the email
	 * @param dob the dob
	 */
	public Person(String firstName, String lastName, String username, String password, String email, Date dob) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
		this.dob = dob;
	}
	

	/**
	 * Instantiates a new person.
	 *
	 * @param username the username
	 * @param password the password
	 */
	public Person(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	


	/**
	 * Instantiates a new person.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 */
	public Person(String firstName, String lastName, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
	}


	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;	
	}

	/**
	 * Instantiates a new person.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 * @param email the email
	 */
	public Person(String firstName, String lastName, String username, String password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
	}


	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

}
