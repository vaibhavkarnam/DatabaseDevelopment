package JDBC.model;

import java.sql.Date;
import java.util.ArrayList;

/**
 * The Class Website.
 */
public class Website {
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The created. */
	private Date created;
	
	/** The updated. */
	private Date updated;
	
	/** The visits. */
	private Integer visits;
	
	/** The page. */
	private ArrayList<Page> page = new ArrayList<>();
	
	/** The website role. */
	private ArrayList<WebsiteRole> websiteRole = new ArrayList<>();
	
	/**
	 * Instantiates a new website.
	 *
	 * @param name the name
	 * @param description the description
	 * @param visits the visits
	 * @param developer the developer
	 */
	public Website(String name, String description, Integer visits, int developer) {
		super();
		this.name = name;
		this.description = description;
		this.visits = visits;
		this.developer = developer;
	}
	
	/**
	 * Instantiates a new website.
	 *
	 * @param name the name
	 * @param description the description
	 * @param visits the visits
	 */
	public Website(String name, String description, Integer visits) {
		super();
		this.name = name;
		this.description = description;
		this.visits = visits;
	}
	
	/** The website priviledge. */
	private ArrayList<WebsitePriviledge> websitePriviledge = new ArrayList<>();
	
	/** The developer. */
	private int developer;
	
	/**
	 * Gets the developer.
	 *
	 * @return the developer
	 */
	public int getDeveloper() {
		return developer;
	}
	
	/**
	 * Sets the developer.
	 *
	 * @param developer the new developer
	 */
	public void setDeveloper(int developer) {
		this.developer = developer;
	}
	
	/**
	 * Instantiates a new website.
	 *
	 * @param name the name
	 * @param description the description
	 * @param created the created
	 * @param updated the updated
	 * @param visits the visits
	 * @param page the page
	 * @param websiteRole the website role
	 * @param websitePriviledge the website priviledge
	 * @param developer the developer
	 */
	public Website(String name, String description, Date created, Date updated, Integer visits, ArrayList<Page> page,
			ArrayList<WebsiteRole> websiteRole, ArrayList<WebsitePriviledge> websitePriviledge, int developer) {
		super();
		this.name = name;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.visits = visits;
		this.page = page;
		this.websiteRole = websiteRole;
		this.websitePriviledge = websitePriviledge;
		this.developer = developer;
	}
	
	/**
	 * Instantiates a new website.
	 */
	public Website() {
		super();
	}
	
	/**
	 * Instantiates a new website.
	 *
	 * @param name the name
	 * @param description the description
	 * @param created the created
	 * @param updated the updated
	 * @param visits the visits
	 */
	public Website(String name, String description, Date created, Date updated, Integer visits) {
		super();
		this.name = name;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.visits = visits;
	}
	
	/**
	 * Instantiates a new website.
	 *
	 * @param name the name
	 * @param description the description
	 */
	public Website(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	/**
	 * Instantiates a new website.
	 *
	 * @param name the name
	 * @param description the description
	 * @param created the created
	 * @param updated the updated
	 * @param visits the visits
	 * @param page the page
	 * @param websiteRole the website role
	 * @param websitePriviledge the website priviledge
	 */
	public Website(String name, String description, Date created, Date updated, Integer visits, ArrayList<Page> page,
			ArrayList<WebsiteRole> websiteRole, ArrayList<WebsitePriviledge> websitePriviledge) {
		super();
		this.name = name;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.visits = visits;
		this.page = page;
		this.websiteRole = websiteRole;
		this.websitePriviledge = websitePriviledge;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Gets the created.
	 *
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}
	
	/**
	 * Sets the created.
	 *
	 * @param created the new created
	 */
	public void setCreated(Date created) {
		this.created = created;
	}
	
	/**
	 * Gets the updated.
	 *
	 * @return the updated
	 */
	public Date getUpdated() {
		return updated;
	}
	
	/**
	 * Sets the updated.
	 *
	 * @param updated the new updated
	 */
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
	/**
	 * Gets the visits.
	 *
	 * @return the visits
	 */
	public Integer getVisits() {
		return visits;
	}
	
	/**
	 * Sets the visits.
	 *
	 * @param visits the new visits
	 */
	public void setVisits(Integer visits) {
		this.visits = visits;
	}
	
	/**
	 * Gets the page.
	 *
	 * @return the page
	 */
	public ArrayList<Page> getPage() {
		return page;
	}
	
	/**
	 * Sets the page.
	 *
	 * @param page the new page
	 */
	public void setPage(ArrayList<Page> page) {
		this.page = page;
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

}
