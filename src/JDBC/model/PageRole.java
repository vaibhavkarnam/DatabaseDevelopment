package JDBC.model;

/**
 * The Class PageRole.
 */
public class PageRole {
	
	/** The role. */
	private String role;
	
	/** The page. */
	private Page page;
	
	/**
	 * Instantiates a new page role.
	 */
	public PageRole() {
		super();
	}
	
	/**
	 * Instantiates a new page role.
	 *
	 * @param role the role
	 * @param page the page
	 * @param developer the developer
	 */
	public PageRole(String role, Page page, Developer developer) {
		super();
		this.role = role;
		this.page = page;
		this.developer = developer;
	}
	
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
	 * Gets the page.
	 *
	 * @return the page
	 */
	public Page getPage() {
		return page;
	}
	
	/**
	 * Sets the page.
	 *
	 * @param page the new page
	 */
	public void setPage(Page page) {
		this.page = page;
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
	
	/** The developer. */
	private Developer developer;
}
