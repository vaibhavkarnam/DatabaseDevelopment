package JDBC.model;

import java.sql.Date;

/**
 * The Class User.
 */
public class User extends Person{
	
	/** The user agreement. */
	private Boolean userAgreement;

	/**
	 * Gets the user agreement.
	 *
	 * @return the user agreement
	 */
	public Boolean getUserAgreement() {
		return userAgreement;
	}

	/**
	 * Sets the user agreement.
	 *
	 * @param userAgreement the new user agreement
	 */
	public void setUserAgreement(Boolean userAgreement) {
		this.userAgreement = userAgreement;
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 * @param email the email
	 * @param dob the dob
	 * @param userAgreement the user agreement
	 */
	public User(String firstName, String lastName, String username, String password, String email, Date dob,
			Boolean userAgreement) {
		super(firstName, lastName, username, password, email, dob);
		this.userAgreement = userAgreement;
	}
	

}
