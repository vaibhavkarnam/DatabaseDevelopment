package JDBC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import JDBC.model.Page;

/**
 * The Class PageDao.
 */
public class PageDao extends BaseDao{
	
	/** The create page. */
	final String CREATE_PAGE = "INSERT INTO PAGE(title, description, created, updated, visits, website) VALUES (?,?,?,?,?,?)";
	
	/** The find all pages. */
	final String FIND_ALL_PAGES = "SELECT * FROM PAGE";
	
	/** The find page. */
	final String FIND_PAGE = "SELECT * FROM PAGE WHERE id = ?";
	
	/** The find pages for website. */
	final String FIND_PAGES_FOR_WEBSITE = "SELECT * FROM PAGE WHERE website = ?";
	
	/** The update page. */
	final String UPDATE_PAGE = "UPDATE PAGE SET title=?, description=?, created=?, updated=?, visits=?, website=? WHERE id = ?";
	
	/** The delete page. */
	final String DELETE_PAGE = "DELETE FROM PAGE WHERE id = ?";
	
	/** The update page name. */
	final String UPDATE_PAGE_NAME = "UPDATE page p SET p.title = CONCAT(?,p.title) WHERE p.website = (SELECT id FROM website WHERE name = ?)";
	
	/** The delete max updated. */
	final String DELETE_MAX_UPDATED = "DELETE FROM page WHERE Website= (SELECT id from website where name = ?) AND id=(SELECT p.id FROM (SELECT * FROM page) AS p,website w WHERE p.updated = (SELECT updated FROM (SELECT * FROM page) AS pg order by pg.updated DESC LIMIT 1) AND w.name= ? AND p.website = w.id);";
	
	/**
	 * Creates the page.
	 *
	 * @param websiteId the website id
	 * @param page the page
	 * @return the int
	 */
	public int createPage(int websiteId, Page page){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(CREATE_PAGE);
			statement.setString(1, page.getTitle());
			statement.setString(2, page.getDescription());
			statement.setDate(3, page.getCreated());
			statement.setDate(4, page.getUpdated());
			statement.setInt(5, page.getViewes());
			statement.setInt(6, websiteId);
			result = statement.executeUpdate();
			statement.close();
			connection.close();
			return result;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	/**
	 * Find all pages.
	 *
	 * @return the array list
	 */
	public ArrayList<Page> findAllPages(){
		PreparedStatement statement =null;
		ArrayList<Page> pages = new ArrayList<>();
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_ALL_PAGES);
			 
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				Page p = new Page();
				p.setTitle(rs.getString("title"));
				p.setDescription(rs.getString("description"));
				p.setCreated(rs.getDate("created"));
				p.setUpdated(rs.getDate("updated"));
				p.setViewes(rs.getInt("visits"));
				p.setWebsite(rs.getInt("website"));
				pages.add(p);
			}
			rs.close();
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pages;
	}
	
	/**
	 * Find pages for website.
	 *
	 * @param websiteId the website id
	 * @return the array list
	 */
	public ArrayList<Page> findPagesForWebsite(int websiteId){
		PreparedStatement statement =null;
		ArrayList<Page> pages = new ArrayList<>();
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_PAGES_FOR_WEBSITE);
			 statement.setInt(1, websiteId);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				Page p = new Page();
				p.setTitle(rs.getString("title"));
				p.setDescription(rs.getString("description"));
				p.setCreated(rs.getDate("created"));
				p.setUpdated(rs.getDate("updated"));
				p.setViewes(rs.getInt("visits"));
				p.setWebsite(rs.getInt("website"));
				pages.add(p);
			}
			rs.close();
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pages;
	}
	
	/**
	 * Find page by id.
	 *
	 * @param pageId the page id
	 * @return the page
	 */
	public Page findPageById(int pageId){
		PreparedStatement statement =null;
		Page p = new Page();
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_PAGE);
				statement.setInt(1, pageId);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				p.setTitle(rs.getString("title"));
				p.setDescription(rs.getString("description"));
				p.setCreated(rs.getDate("created"));
				p.setUpdated(rs.getDate("updated"));
				p.setViewes(rs.getInt("visits"));
				p.setWebsite(rs.getInt("website"));
			}
			rs.close();
			statement.close();
			connection.close();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	
	/**
	 * Delete page.
	 *
	 * @param pageId the page id
	 * @return the int
	 */
	public int deletePage(int pageId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_PAGE);
			statement.setInt(1, pageId);
			result = statement.executeUpdate();
			statement.close();
			connection.close();
			return result;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Delete max update page.
	 *
	 * @param pageName the page name
	 * @return the int
	 */
	public int deleteMaxUpdatePage(String pageName){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_MAX_UPDATED);
			statement.setString(1, pageName);
			statement.setString(2, pageName);
			result = statement.executeUpdate();
			statement.close();
			connection.close();
			return result;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Update page.
	 *
	 * @param pageId the page id
	 * @param page the page
	 * @return the int
	 */
	public int updatePage(int pageId, Page page){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(UPDATE_PAGE);
			statement.setString(1, page.getTitle());
			statement.setString(2, page.getDescription());
			statement.setDate(3, page.getCreated());
			statement.setDate(4, page.getUpdated());
			statement.setInt(5, page.getViewes());
			statement.setInt(6, page.getWebsite());
			statement.setInt(7, pageId);
			result = statement.executeUpdate();
			statement.close();
			connection.close();
			return result;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Update page name.
	 *
	 * @param concatName the concat name
	 * @param pageName the page name
	 * @return the int
	 */
	public int updatePageName(String concatName, String pageName){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
				PreparedStatement statement = connection.prepareStatement(UPDATE_PAGE_NAME);
				statement.setString(1, concatName);
				statement.setString(2, pageName);
				result = statement.executeUpdate();
				statement.close();	
			connection.close();
			return result;

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		PageDao pdao = new PageDao();
		Page p = new Page();
		p.setTitle("updated page");
		p.setDescription("updated page to website");
		p.setViewes(12346);
//		.setFirstName("vaibhav");
//		dev.setFirstName("Karnam");
//		dev.setDeveloperKey("vaib");
//		dev.setUsername("vaibhav");
//		dev.setPassword("karnam");
//		Website web = new Website("zillow","houses",1234);
//		wdao.createWebsite(12, web);
//		pdao.updatePage(123, p);
//		ArrayList<Website>websites = wdao.findAllWebsi();
//		for(Website w : websites){
//			System.out.println(w.getName());
//			System.out.println(w.getDescription());
//			System.out.println(w.getCreated());
//			System.out.println(w.getUpdated());
//			System.out.println(w.getVisits());
//			System.out.println(w.getDeveloper());
//		}
		
//		Website w = wdao.findWebsiteById(345);
//		System.out.println(w.getName());
//		System.out.println(w.getDescription());
//		System.out.println(w.getCreated());
//		System.out.println(w.getUpdated());
//		System.out.println(w.getVisits());
//		System.out.println(w.getDeveloper());
		
		ArrayList<Page> pages = pdao.findPagesForWebsite(123);
		for(Page pg : pages)
		{
			System.out.println(pg.getTitle());
			System.out.println(pg.getDescription());
			System.out.println(pg.getCreated());
			System.out.println(pg.getUpdated());
			System.out.println(pg.getWebsite());
		}
		
		Page pg = pdao.findPageById(234);
		System.out.println(pg.getTitle());
		System.out.println(pg.getDescription());
		System.out.println(pg.getCreated());
		System.out.println(pg.getUpdated());
		System.out.println(pg.getWebsite());
		
	}

}
