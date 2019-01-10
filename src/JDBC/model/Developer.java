package JDBC.model;

import java.sql.Date;
import java.util.ArrayList;

/**
 * The Class Developer.
 */
public class Developer extends Person {
	
	/**
	 * Instantiates a new developer.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 * @param developerKey the developer key
	 */
	public Developer(String firstName, String lastName, String username, String password, String developerKey) {
		super(firstName, lastName, username, password);
		this.developerKey = developerKey;
	}
	
	/** The person. */
	private int person;
	
	/**
	 * Instantiates a new developer.
	 *
	 * @param person the person
	 * @param developerKey the developer key
	 * @param website the website
	 * @param websiteRole the website role
	 * @param websitePriviledge the website priviledge
	 * @param pageRole the page role
	 * @param pagePriviledge the page priviledge
	 */
	public Developer(int person, String developerKey, ArrayList<Website> website, ArrayList<WebsiteRole> websiteRole,
			ArrayList<WebsitePriviledge> websitePriviledge, ArrayList<PageRole> pageRole,
			ArrayList<PagePriviledge> pagePriviledge) {
		super();
		this.person = person;
		this.developerKey = developerKey;
		this.website = website;
		this.websiteRole = websiteRole;
		this.websitePriviledge = websitePriviledge;
		this.pageRole = pageRole;
		this.pagePriviledge = pagePriviledge;
	}
	
	/**
	 * Gets the person.
	 *
	 * @return the person
	 */
	public int getPerson() {
		return person;
	}
	
	/**
	 * Sets the person.
	 *
	 * @param person the new person
	 */
	public void setPerson(int person) {
		this.person = person;
	}

	/** The developer key. */
	private String developerKey;
	
	/** The website. */
	private ArrayList<Website> website = new ArrayList<>();
	
	/** The website role. */
	private ArrayList<WebsiteRole> websiteRole = new ArrayList<>();
	
	/**
	 * Instantiates a new developer.
	 */
	public Developer() {
		super();
	}
	
	/** The website priviledge. */
	private ArrayList<WebsitePriviledge> websitePriviledge = new ArrayList<>();
	
	/** The page role. */
	private ArrayList<PageRole> pageRole = new ArrayList<>();
	
	/** The page priviledge. */
	private ArrayList<PagePriviledge> pagePriviledge = new ArrayList<>();
	
	/**
	 * Adds the website.
	 *
	 * @param web the web
	 */
	public void addWebsite(Website web){
		website.add(web);
	}
	
	/**
	 * Removes the website.
	 *
	 * @param web the web
	 */
	public void removeWebsite(Website web){
		website.remove(web);
	}
	
	/**
	 * Gets the developer key.
	 *
	 * @return the developer key
	 */
	public String getDeveloperKey() {
		return developerKey;
	}
	
	/**
	 * Sets the developer key.
	 *
	 * @param developerKey the new developer key
	 */
	public void setDeveloperKey(String developerKey) {
		this.developerKey = developerKey;
	}
	
	/**
	 * Gets the website.
	 *
	 * @return the website
	 */
	public ArrayList<Website> getWebsite() {
		return website;
	}
	
	/**
	 * Sets the website.
	 *
	 * @param website the new website
	 */
	public void setWebsite(ArrayList<Website> website) {
		this.website = website;
	}
	
	/**
	 * Gets the website role.
	 *
	 * @return the website role
	 */
	public ArrayList<WebsiteRole> getWebsiteRole() {
		return websiteRole;
	}
	
	/**
	 * Sets the website role.
	 *
	 * @param websiteRole the new website role
	 */
	public void setWebsiteRole(ArrayList<WebsiteRole> websiteRole) {
		this.websiteRole = websiteRole;
	}
	
	/**
	 * Gets the website priviledge.
	 *
	 * @return the website priviledge
	 */
	public ArrayList<WebsitePriviledge> getWebsitePriviledge() {
		return websitePriviledge;
	}
	
	/**
	 * Sets the website priviledge.
	 *
	 * @param websitePriviledge the new website priviledge
	 */
	public void setWebsitePriviledge(ArrayList<WebsitePriviledge> websitePriviledge) {
		this.websitePriviledge = websitePriviledge;
	}
	
	/**
	 * Gets the page role.
	 *
	 * @return the page role
	 */
	public ArrayList<PageRole> getPageRole() {
		return pageRole;
	}
	
	/**
	 * Sets the page role.
	 *
	 * @param pageRole the new page role
	 */
	public void setPageRole(ArrayList<PageRole> pageRole) {
		this.pageRole = pageRole;
	}
	
	/**
	 * Gets the page priviledge.
	 *
	 * @return the page priviledge
	 */
	public ArrayList<PagePriviledge> getPagePriviledge() {
		return pagePriviledge;
	}
	
	/**
	 * Sets the page priviledge.
	 *
	 * @param pagePriviledge the new page priviledge
	 */
	public void setPagePriviledge(ArrayList<PagePriviledge> pagePriviledge) {
		this.pagePriviledge = pagePriviledge;
	}
	
	/**
	 * Instantiates a new developer.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 * @param email the email
	 * @param dob the dob
	 * @param developerKey the developer key
	 * @param website the website
	 * @param websiteRole the website role
	 * @param websitePriviledge the website priviledge
	 * @param pageRole the page role
	 * @param pagePriviledge the page priviledge
	 */
	public Developer(String firstName, String lastName, String username, String password, String email, Date dob,
			String developerKey, ArrayList<Website> website, ArrayList<WebsiteRole> websiteRole,
			ArrayList<WebsitePriviledge> websitePriviledge, ArrayList<PageRole> pageRole,
			ArrayList<PagePriviledge> pagePriviledge) {
		super(firstName, lastName, username, password, email, dob);
		this.developerKey = developerKey;
		this.website = website;
		this.websiteRole = websiteRole;
		this.websitePriviledge = websitePriviledge;
		this.pageRole = pageRole;
		this.pagePriviledge = pagePriviledge;
	}
	
	/**
	 * Instantiates a new developer.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 * @param email the email
	 * @param developerKey the developer key
	 */
	public Developer(String firstName, String lastName, String username, String password, String email,
			String developerKey) {
		super(firstName, lastName, username, password, email);
		this.developerKey = developerKey;
	}
	
	/**
	 * Instantiates a new developer.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 * @param email the email
	 * @param dob the dob
	 */
	public Developer(String firstName, String lastName, String username, String password, String email, Date dob) {
		super(firstName, lastName, username, password, email, dob);
	}
	
	/**
	 * Instantiates a new developer.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param username the username
	 * @param password the password
	 * @param email the email
	 * @param dob the dob
	 * @param developerKey the developer key
	 */
	public Developer(String firstName, String lastName, String username, String password, String email, Date dob,
			String developerKey) {
		super(firstName, lastName, username, password, email, dob);
		this.developerKey = developerKey;
	}

	
}
