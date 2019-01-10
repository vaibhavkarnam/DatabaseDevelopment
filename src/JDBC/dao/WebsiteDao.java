package JDBC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JDBC.model.Developer;
import JDBC.model.Website;

/**
 * The Class WebsiteDao.
 */
public class WebsiteDao extends BaseDao{
	
	/** The create website. */
	final String CREATE_WEBSITE = "INSERT INTO Website(name, description, created, updated, visits, developer) VALUES (?,?,?,?,?,?)";
	
	/** The find all websites. */
	final String FIND_ALL_WEBSITES = "SELECT * FROM WEBSITE";
	
	/** The find websites for developer. */
	final String FIND_WEBSITES_FOR_DEVELOPER = "SELECT * FROM WEBSITE WHERE developer = ?";
	
	/** The find website. */
	final String FIND_WEBSITE = "SELECT * FROM WEBSITE WHERE id = ?";
	
	/** The update website. */
	final String UPDATE_WEBSITE = "UPDATE Website SET name = ?, description = ?, created = ?, updated =? , visits =? developer =? VALUES WHERE id = ?";
	
	/** The delete website. */
	final String DELETE_WEBSITE = "DELETE FROM WEBSITE WHERE id = ?";
	
	/** The delete website by name. */
	final String DELETE_WEBSITE_BY_NAME = "DELETE FROM WEBSITE WHERE name = ?";


	/**
	 * Creates the website.
	 *
	 * @param developerId the developer id
	 * @param website the website
	 * @return the int
	 */
	public int createWebsite(int developerId, Website website){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(CREATE_WEBSITE);
			statement.setString(1, website.getName());
			statement.setString(2, website.getDescription());
			statement.setDate(3, website.getCreated());
			statement.setDate(4, website.getUpdated());
			statement.setInt(5, website.getVisits());
			statement.setInt(6, developerId);
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
	 * Find all websites.
	 *
	 * @return the array list
	 */
	public ArrayList<Website> findAllWebsites(){
		PreparedStatement statement =null;
		ArrayList<Website> websites = new ArrayList<>();
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_ALL_WEBSITES);
			 
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				Website web = new Website();
				web.setName(rs.getString("name"));
				web.setDescription(rs.getString("description"));
				web.setCreated(rs.getDate("created"));
				web.setUpdated(rs.getDate("updated"));
				web.setVisits(rs.getInt("visits"));
				web.setDeveloper(rs.getInt("developer"));
				websites.add(web);
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
		return websites;
	}
	
	/**
	 * Find websites for developer.
	 *
	 * @param developerId the developer id
	 * @return the array list
	 */
	public ArrayList<Website> findWebsitesForDeveloper(int developerId){
		PreparedStatement statement =null;
		ArrayList<Website> websites = new ArrayList<>();
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_WEBSITES_FOR_DEVELOPER);
			 statement.setInt(1, developerId);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				Website web = new Website();
				web.setName(rs.getString("name"));
				web.setDescription(rs.getString("description"));
				web.setCreated(rs.getDate("created"));
				web.setUpdated(rs.getDate("updated"));
				web.setVisits(rs.getInt("visits"));
				web.setDeveloper(rs.getInt("developer"));
				websites.add(web);
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
		return websites;
	}
	
	/**
	 * Find website by id.
	 *
	 * @param websiteId the website id
	 * @return the website
	 */
	public Website findWebsiteById(int websiteId){
		PreparedStatement statement =null;
		Website web = new Website();
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_WEBSITE);
				statement.setInt(1, websiteId);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				web.setName(rs.getString("name"));
				web.setDescription(rs.getString("description"));
				web.setCreated(rs.getDate("created"));
				web.setUpdated(rs.getDate("updated"));
				web.setVisits(rs.getInt("visits"));
				web.setDeveloper(rs.getInt("developer"));
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
		return web;
	}
	
	/**
	 * Update website.
	 *
	 * @param websiteId the website id
	 * @param website the website
	 * @return the int
	 */
	public int updateWebsite(int websiteId, Website website){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(UPDATE_WEBSITE);
			statement.setString(1, website.getName());
			statement.setString(2, website.getDescription());
			statement.setDate(3, website.getCreated());
			statement.setDate(4, website.getUpdated());
			statement.setInt(5, website.getVisits());
			statement.setInt(6, website.getDeveloper());
			statement.setInt(7, websiteId);
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
	 * Delete website.
	 *
	 * @param websiteId the website id
	 * @return the int
	 */
	public int deleteWebsite(int websiteId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_WEBSITE);
			statement.setInt(1, websiteId);
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
	 * Delete website by name.
	 *
	 * @param websiteName the website name
	 * @return the int
	 */
	public int deleteWebsiteByName(String websiteName){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_WEBSITE_BY_NAME);
			statement.setString(1, websiteName);
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
		WebsiteDao wdao = new WebsiteDao();
		wdao.deleteWebsite(680);
//		Developer dev = new Developer();
//		dev.setFirstName("vaibhav");
//		dev.setFirstName("Karnam");
//		dev.setDeveloperKey("vaib");
//		dev.setUsername("vaibhav");
//		dev.setPassword("karnam");
//		Website web = new Website("zillows","find your new home",789);
//		wdao.createWebsite(12, web);
//		
//		ArrayList<Website>websites = wdao.findWebsitesForDeveloper(12);
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
	}

}
