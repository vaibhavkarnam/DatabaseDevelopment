package JDBC.model;

/**
 * The Class WebsitePriviledge.
 */
public class WebsitePriviledge {

	/** The priviledge. */
	private String priviledge;
	
	/** The website. */
	private Website website;
	
	/** The developer. */
	private Developer developer;
	
	/**
	 * Instantiates a new website priviledge.
	 */
	public WebsitePriviledge() {
		super();
	}
	
	/**
	 * Instantiates a new website priviledge.
	 *
	 * @param priviledge the priviledge
	 * @param website the website
	 * @param developer the developer
	 */
	public WebsitePriviledge(String priviledge, Website website, Developer developer) {
		super();
		this.priviledge = priviledge;
		this.website = website;
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
}
