package JDBC.model;

/**
 * The Class PagePriviledge.
 */
public class PagePriviledge {
	
	/** The priviledge. */
	private String priviledge;
	
	/** The page. */
	private Page page;
	
	/**
	 * Instantiates a new page priviledge.
	 */
	public PagePriviledge() {
		super();
	}
	
	/**
	 * Instantiates a new page priviledge.
	 *
	 * @param priviledge the priviledge
	 * @param page the page
	 * @param developer the developer
	 */
	public PagePriviledge(String priviledge, Page page, Developer developer) {
		super();
		this.priviledge = priviledge;
		this.page = page;
		this.developer = developer;
	}
	
	/**
	 * Gets the priviledge.
	 *
	 * @return the priviledge
	 */
	public String getPriviledge() {
		return priviledge;
	}
	
	/**
	 * Sets the priviledge.
	 *
	 * @param priviledge the new priviledge
	 */
	public void setPriviledge(String priviledge) {
		this.priviledge = priviledge;
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
