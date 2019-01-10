package JDBC.model;

import java.sql.Date;
import java.util.ArrayList;

/**
 * The Class Page.
 */
public class Page {

	/** The title. */
	private String title;
	
	/** The description. */
	private String description;
	
	/** The created. */
	private Date created;
	
	/** The updated. */
	private Date updated;
	
	/** The viewes. */
	private Integer viewes;
	
	/** The website. */
	private int website;
	
	/** The widget. */
	private ArrayList<Widget> widget = new ArrayList<>();
	
	/** The page role. */
	private ArrayList<PageRole> pageRole = new ArrayList<>();
	
	/** The page priviledge. */
	private ArrayList<PagePriviledge> pagePriviledge = new ArrayList<>();
	
	/**
	 * Instantiates a new page.
	 */
	public Page() {
		super();
	}
	
	/**
	 * Instantiates a new page.
	 *
	 * @param title the title
	 * @param description the description
	 * @param created the created
	 * @param updated the updated
	 * @param viewes the viewes
	 * @param website the website
	 */
	public Page(String title, String description, Date created, Date updated, Integer viewes, int website) {
		super();
		this.title = title;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.viewes = viewes;
		this.website = website;
	}
	
	/**
	 * Instantiates a new page.
	 *
	 * @param title the title
	 * @param description the description
	 * @param created the created
	 * @param updated the updated
	 * @param viewes the viewes
	 * @param website the website
	 * @param widget the widget
	 * @param pageRole the page role
	 * @param pagePriviledge the page priviledge
	 */
	public Page(String title, String description, Date created, Date updated, Integer viewes, int website,
			ArrayList<Widget> widget, ArrayList<PageRole> pageRole, ArrayList<PagePriviledge> pagePriviledge) {
		super();
		this.title = title;
		this.description = description;
		this.created = created;
		this.updated = updated;
		this.viewes = viewes;
		this.website = website;
		this.widget = widget;
		this.pageRole = pageRole;
		this.pagePriviledge = pagePriviledge;
	}

	/**
	 * Instantiates a new page.
	 *
	 * @param title the title
	 * @param description the description
	 * @param viewes the viewes
	 */
	public Page(String title, String description, Integer viewes) {
		super();
		this.title = title;
		this.description = description;
		this.viewes = viewes;
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * Gets the viewes.
	 *
	 * @return the viewes
	 */
	public Integer getViewes() {
		return viewes;
	}
	
	/**
	 * Sets the viewes.
	 *
	 * @param viewes the new viewes
	 */
	public void setViewes(Integer viewes) {
		this.viewes = viewes;
	}
	
	/**
	 * Gets the website.
	 *
	 * @return the website
	 */
	public int getWebsite() {
		return website;
	}
	
	/**
	 * Sets the website.
	 *
	 * @param website the new website
	 */
	public void setWebsite(int website) {
		this.website = website;
	}
	
	/**
	 * Gets the widget.
	 *
	 * @return the widget
	 */
	public ArrayList<Widget> getWidget() {
		return widget;
	}
	
	/**
	 * Sets the widget.
	 *
	 * @param widget the new widget
	 */
	public void setWidget(ArrayList<Widget> widget) {
		this.widget = widget;
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
}
