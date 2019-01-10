package JDBC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JDBC.model.Website;

/**
 * The Class RoleDao.
 */
public class RoleDao extends BaseDao{
	
	/** The create page role. */
	final String CREATE_PAGE_ROLE = "INSERT INTO PageRole (developer, page, role) VALUES (?,?,?)";
	
	/** The create website role. */
	final String CREATE_WEBSITE_ROLE = "INSERT INTO WebsiteRole (developer, website, role) VALUES (?,?,?)";
	
	/** The delete website role. */
	final String DELETE_WEBSITE_ROLE = "DELETE FROM WebsiteRole WHERE role = ?";
	
	/** The delete page role. */
	final String DELETE_PAGE_ROLE = "DELETE FROM PageRole WHERE role = ?";
	
	/** The find role for dev. */
	final String FIND_ROLE_FOR_DEV="SELECT * FROM PAGEROLE WHERE page = ? AND developer = ?";
	
	/** The update role for dev. */
	final String UPDATE_ROLE_FOR_DEV="UPDATE PAGEROLE SET role = ? WHERE page = ? AND developer = ?";
	
	/**
	 * Assign website role.
	 *
	 * @param developerId the developer id
	 * @param websiteId the website id
	 * @param roleId the role id
	 * @return the int
	 */
	public int assignWebsiteRole(int developerId, int websiteId, String roleId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(CREATE_WEBSITE_ROLE);
			statement.setInt(1, developerId);
			statement.setInt(2, websiteId);
			statement.setString(3, roleId);
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
	 * Delete website role.
	 *
	 * @param developerId the developer id
	 * @param websiteId the website id
	 * @param roleId the role id
	 * @return the int
	 */
	public int deleteWebsiteRole(int developerId, int websiteId, String roleId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_WEBSITE_ROLE);
			statement.setString(1, roleId);
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
	 * Assign page role.
	 *
	 * @param developerId the developer id
	 * @param pageId the page id
	 * @param roleId the role id
	 * @return the int
	 */
	public int assignPageRole(int developerId, int pageId, String roleId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(CREATE_PAGE_ROLE);
			statement.setInt(1, developerId);
			statement.setInt(2, pageId);
			statement.setString(3, roleId);
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
	 * Delete page role.
	 *
	 * @param developerId the developer id
	 * @param pageId the page id
	 * @param roleId the role id
	 * @return the int
	 */
	public int deletePageRole(int developerId, int pageId, String roleId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_PAGE_ROLE);
			statement.setString(1, roleId);
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
	 * Update page role.
	 *
	 * @param pageId the page id
	 * @param dev1 the dev 1
	 * @param dev2 the dev 2
	 * @return the int
	 */
	public int updatePageRole(int pageId, int dev1,int dev2)
	{
		int results = -1;
		String role1 = null;
		String role2 = null;
		Connection connection = null;
		PreparedStatement statement=null;
		try {
			Class.forName(JDBC_DRIVER);
			connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			statement = connection.prepareStatement(FIND_ROLE_FOR_DEV);
			statement.setInt(1, pageId);
			statement.setInt(2, dev1);
			
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				role1= result.getString("role");
			}
			
			
			statement = connection.prepareStatement(FIND_ROLE_FOR_DEV);
			statement.setInt(1, pageId);
			statement.setInt(2, dev2);
			result = statement.executeQuery();
			while(result.next()) {
				role2= result.getString("role");
			}
			statement = connection.prepareStatement(UPDATE_ROLE_FOR_DEV);
			statement.setString(1, role1);
			statement.setInt(2, pageId);
			statement.setInt(3, dev2);
			results = statement.executeUpdate();
			
			
			statement = connection.prepareStatement(UPDATE_ROLE_FOR_DEV);
			statement.setString(1, role2);
			statement.setInt(2, pageId);
			statement.setInt(3, dev1);
			results = statement.executeUpdate();
			
			
			result.close();
			statement.close();
			connection.close();
			return results;
		} 
		
		catch (ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return results;
	}
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		RoleDao role = new RoleDao();
//		role.assignWebsiteRole(12, 681, "Editor");
//		role.assignPageRole(12, 568, "Editor");
//		role.deletePageRole(12, 568, "Editor");
//		role.deleteWebsiteRole(12, 681, "Editor");

	}
}
