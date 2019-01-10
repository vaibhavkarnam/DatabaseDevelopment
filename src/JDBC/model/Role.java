package JDBC.model;

/**
 * The Class Role.
 */
public class Role {

	/** The id. */
	private String id;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Instantiates a new role.
	 *
	 * @param id the id
	 */
	public Role(String id) {
		super();
		this.id = id;
	}

	/**
	 * Instantiates a new role.
	 */
	public Role() {
		super();
	}
	
}
