package JDBC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * The Class PriviledgeDao.
 */
public class PriviledgeDao extends BaseDao {
	
	/** The create page priviledge. */
	final String CREATE_PAGE_PRIVILEDGE = "INSERT INTO PagePriviledge (priviledge, developer, page) VALUES (?,?,?)";
	
	/** The create website priviledge. */
	final String CREATE_WEBSITE_PRIVILEDGE = "INSERT INTO WebsitePriviledge (priviledge, developer, website) VALUES (?,?,?)";
	
	/** The delete website priviledge. */
	final String DELETE_WEBSITE_PRIVILEDGE = "DELETE FROM WebsitePriviledge WHERE priviledge = ?";
	
	/** The delete page priviledge. */
	final String DELETE_PAGE_PRIVILEDGE = "DELETE FROM PagePriviledge WHERE priviledge = ?";

	
	/**
	 * Assign website priviledge.
	 *
	 * @param developerId the developer id
	 * @param websiteId the website id
	 * @param priviledgeId the priviledge id
	 * @return the int
	 */
	public int assignWebsitePriviledge(int developerId, int websiteId, String priviledgeId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(CREATE_WEBSITE_PRIVILEDGE);
			statement.setString(1, priviledgeId);
			statement.setInt(2, developerId);
			statement.setInt(3, websiteId);
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
	 * Delete website priviledge.
	 *
	 * @param developerId the developer id
	 * @param websiteId the website id
	 * @param priviledgeId the priviledge id
	 * @return the int
	 */
	public int deleteWebsitePriviledge(int developerId, int websiteId, String priviledgeId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_WEBSITE_PRIVILEDGE);
			statement.setString(1, priviledgeId);
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
	 * Assign page priviledge.
	 *
	 * @param developerId the developer id
	 * @param pageId the page id
	 * @param priviledgeId the priviledge id
	 * @return the int
	 */
	public int assignPagePriviledge(int developerId, int pageId, String priviledgeId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(CREATE_PAGE_PRIVILEDGE);
			statement.setString(1, priviledgeId);
			statement.setInt(2, developerId);
			statement.setInt(3, pageId);
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
	 * Delete page priviledge.
	 *
	 * @param developerId the developer id
	 * @param pageId the page id
	 * @param priviledgeId the priviledge id
	 * @return the int
	 */
	public int deletePagePriviledge(int developerId, int pageId, String priviledgeId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_PAGE_PRIVILEDGE);
			statement.setString(1, priviledgeId);
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
		PriviledgeDao role = new PriviledgeDao();
//		role.assignWebsitePriviledge(12, 123, "create");
		role.assignPagePriviledge(12, 568, "read");
		role.deletePagePriviledge(12, 568, "update");
		role.deleteWebsitePriviledge(12, 123, "create");

	}


}
