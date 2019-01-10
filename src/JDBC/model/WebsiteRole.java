package JDBC.model;

/**
 * The Class WebsiteRole.
 */
public class WebsiteRole {

	/** The role. */
	private String role;
	
	/** The website. */
	private Website website;
	
	/** The developer. */
	private Developer developer;
	
	/**
	 * Gets the role.
	 *
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	
	/**
	 * Sets the role.
	 *
	 * @param role the new role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	
	/**
	 * Gets the website.
	 *
	 * @return the website
	 */
	public Website getWebsite() {
		return website;
	}
	
	/**
	 * Sets the website.
	 *
	 * @param website the new website
	 */
	public void setWebsite(Website website) {
		this.website = website;
	}
	
	/**
	 * Gets the developer.
	 *
	 * @return the developer
	 */
	public Developer getDeveloper() {
		return developer;
	}
	
	/**
	 * Sets the developer.
	 *
	 * @param developer the new developer
	 */
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	
	/**
	 * Instantiates a new website role.
	 *
	 * @param role the role
	 * @param website the website
	 * @param developer the developer
	 */
	public WebsiteRole(String role, Website website, Developer developer) {
		super();
		this.role = role;
		this.website = website;
		this.developer = developer;
	}
	
	/**
	 * Instantiates a new website role.
	 */
	public WebsiteRole() {
		super();
	}
	
}
