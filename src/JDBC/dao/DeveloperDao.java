package JDBC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JDBC.model.Developer;



// TODO: Auto-generated Javadoc
/**
 * The Class DeveloperDao.
 */
public class DeveloperDao extends BaseDao {
	
/** The create person. */
final String CREATE_PERSON = "INSERT INTO Person(firstName, lastName, username, password, email, dob) VALUES (?,?,?,?,?,?)";

/** The create developer. */
final String CREATE_DEVELOPER = "INSERT INTO Developer(person, developerKey) VALUES (?,?)";

/** The find all devs. */
final String FIND_ALL_DEVS = "SELECT * FROM DEVELOPER D, PERSON P WHERE D.person = p.id";

/** The find developer. */
final String FIND_DEVELOPER = "SELECT * FROM DEVELOPER D, PERSON P WHERE D.person = p.id AND d.person = ?";

/** The find developer by username. */
final String FIND_DEVELOPER_BY_USERNAME = "SELECT * FROM DEVELOPER D, PERSON P WHERE D.person = p.id AND p.username = ?";

/** The find developer by credentials. */
final String FIND_DEVELOPER_BY_CREDENTIALS = "SELECT * FROM DEVELOPER D, PERSON P WHERE D.person = p.id AND p.username = ? and p.password = ?";

/** The update person. */
final String UPDATE_PERSON = "UPDATE Person SET firstName = ?, lastName = ?, username =?, password =?, email = ?, dob = ? WHERE id = ?";

/** The update developer. */
final String UPDATE_DEVELOPER = "UPDATE Developer SET developerKey = ? WHERE person = ?";

/** The delete person. */
final String DELETE_PERSON = "DELETE FROM PERSON WHERE id = ?";

/** The delete developer. */
final String DELETE_DEVELOPER = "DELETE FROM  Developer WHERE person = ?";

/** The update phone. */
final String UPDATE_PHONE = "UPDATE PHONE SET phone = ? WHERE person = ?";

/** The delete address. */
final String DELETE_ADDRESS = "DELETE FROM ADDRESS WHERE primaryAddress = 1 AND person = ?";


	/**
	 * Update phone.
	 *
	 * @param name the name
	 * @param phone the phone
	 * @return the int
	 */
	public int updatePhone(String name, String phone){
		Developer charlie = findDeveloperByUsername("charlie");
		int personId = charlie.getPerson();
		int result = -1;
		PreparedStatement statement =null;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(UPDATE_PHONE);
			statement.setString(1, phone);
			statement.setInt(2, personId);
			result = statement.executeUpdate();
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
		return result;
		
	}
	
	/**
	 * Delete address.
	 *
	 * @param name the name
	 * @return the int
	 */
	public int deleteAddress(String name){
		Developer charlie = findDeveloperByUsername("alice");
		int personId = charlie.getPerson();
		int result = -1;
		PreparedStatement statement =null;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(DELETE_ADDRESS);
			statement.setInt(1, personId);
			result = statement.executeUpdate();
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
		return result;
		
	}
	
	/**
	 * Creates the developer.
	 *
	 * @param developer the developer
	 * @return the int
	 */
	public int createDeveloper(Developer developer){
		int result = -1;
		PreparedStatement statement =null;
		int personId = 0;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(CREATE_PERSON, statement.RETURN_GENERATED_KEYS);
			statement.setString(1, developer.getFirstName());
			statement.setString(2, developer.getLastName());
			statement.setString(3, developer.getUsername());
			statement.setString(4, developer.getPassword());
			statement.setString(5, developer.getEmail());
			statement.setDate(6, developer.getDob());
			result = statement.executeUpdate();
			ResultSet rs = statement.getGeneratedKeys();
			while(rs.next())
			{
				 personId = rs.getInt(1);
			}
			statement = connection.prepareStatement(CREATE_DEVELOPER);
			statement.setInt(1, personId);
			statement.setString(2, developer.getDeveloperKey());
			result = statement.executeUpdate();
			rs.close();
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
	 * Find all developers.
	 *
	 * @return the array list
	 */
	public ArrayList<Developer> findAllDevelopers(){
		PreparedStatement statement =null;
		ArrayList<Developer> devlist = new ArrayList<>();
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_ALL_DEVS);
			 
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				Developer dev = new Developer();
				dev.setPerson(rs.getInt(1));
				dev.setFirstName(rs.getString("firstName"));
				dev.setLastName(rs.getString("LastName"));
				dev.setUsername(rs.getString("username"));
				dev.setPassword(rs.getString("password"));
				dev.setEmail(rs.getString("email"));
				dev.setDob(rs.getDate("dob"));
				dev.setDeveloperKey(rs.getString("developerkey"));
				devlist.add(dev);
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
		return devlist;
	}
	
	/**
	 * Find developer by id.
	 *
	 * @param developerId the developer id
	 * @return the developer
	 */
	public Developer findDeveloperById(int developerId){
		PreparedStatement statement =null;
		Developer developer = new Developer();
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_DEVELOPER);
				statement.setInt(1, developerId);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				developer.setPerson(rs.getInt(1));
				developer.setFirstName(rs.getString("firstName"));
				developer.setLastName(rs.getString("LastName"));
				developer.setUsername(rs.getString("username"));
				developer.setPassword(rs.getString("password"));
				developer.setEmail(rs.getString("email"));
				developer.setDob(rs.getDate("dob"));
				developer.setDeveloperKey(rs.getString("developerkey"));
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
		return developer;
	}
	
	/**
	 * Find developer by username.
	 *
	 * @param username the username
	 * @return the developer
	 */
	public Developer findDeveloperByUsername(String username){
		PreparedStatement statement =null;
		Developer developer = new Developer();
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_DEVELOPER_BY_USERNAME);
				statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				developer.setPerson(rs.getInt(1));
				developer.setFirstName(rs.getString("firstName"));
				developer.setLastName(rs.getString("LastName"));
				developer.setUsername(rs.getString("username"));
				developer.setPassword(rs.getString("password"));
				developer.setEmail(rs.getString("email"));
				developer.setDob(rs.getDate("dob"));
				developer.setDeveloperKey(rs.getString("developerkey"));
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
		return developer;
	}
	
	/**
	 * Find developer by credentials.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the developer
	 */
	public Developer findDeveloperByCredentials(String username, String password){
		PreparedStatement statement =null;
		Developer developer = new Developer();
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_DEVELOPER_BY_CREDENTIALS);
				statement.setString(1, username);
				statement.setString(2, password);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				developer.setPerson(rs.getInt(1));
				developer.setFirstName(rs.getString("firstName"));
				developer.setLastName(rs.getString("LastName"));
				developer.setUsername(rs.getString("username"));
				developer.setPassword(rs.getString("password"));
				developer.setEmail(rs.getString("email"));
				developer.setDob(rs.getDate("dob"));
				developer.setDeveloperKey(rs.getString("developerkey"));
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
		return developer;
	}
	
	/**
	 * Update developer.
	 *
	 * @param developerId the developer id
	 * @param developer the developer
	 * @return the int
	 */
	public int updateDeveloper(int developerId, Developer developer){
		int result = -1;
		PreparedStatement statement =null;
		int personId = 0;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(UPDATE_PERSON, statement.RETURN_GENERATED_KEYS);
			statement.setString(1, developer.getFirstName());
			statement.setString(2, developer.getLastName());
			statement.setString(3, developer.getUsername());
			statement.setString(4, developer.getPassword());
			statement.setString(5, developer.getEmail());
			statement.setDate(6, developer.getDob());
			statement.setInt(7, developerId);
			result = statement.executeUpdate();
			ResultSet rs = statement.getGeneratedKeys();
			while(rs.next())
			{
				 personId = rs.getInt(1);
			}
			statement = connection.prepareStatement(UPDATE_DEVELOPER);
			statement.setString(1, developer.getDeveloperKey());
			statement.setInt(2, developerId);
			result = statement.executeUpdate();
			rs.close();
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
	 * Delete developer.
	 *
	 * @param developerId the developer id
	 * @return the int
	 */
	public int deleteDeveloper(int developerId){
		int result = -1;
		PreparedStatement statement =null;
		int personId;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			statement = connection.prepareStatement(DELETE_PERSON, statement.RETURN_GENERATED_KEYS);
			statement.setInt(1, developerId);
			result = statement.executeUpdate();
			ResultSet rs = statement.getGeneratedKeys();
			while(rs.next())
			{
				 personId = rs.getInt(1);
			}
			statement = connection.prepareStatement(DELETE_DEVELOPER);
			statement.setInt(1, developerId);
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
		DeveloperDao ddao = new DeveloperDao();
		Developer dev = new Developer("vaibha","karna","vaibhavakar","karn","vaikeys","key");
		ddao.createDeveloper(dev);
	//	ddao.deleteDeveloper(60);
//		ArrayList<Developer>devlist = ddao.findAllDevelopers();
//		for(Developer d : devlist){
//			System.out.println(d.getFirstName());
//			System.out.println(d.getLastName());
//			System.out.println(d.getUsername());
//			System.out.println(d.getPassword());
//			System.out.println(d.getDob());
//			System.out.println(d.getEmail());
//			System.out.println(d.getDeveloperKey());
//		}
		
//		Developer d = ddao.findDeveloperByCredentials("alice","alice" );
//		System.out.println(d.getFirstName());
//		System.out.println(d.getLastName());
//		System.out.println(d.getUsername());
//		System.out.println(d.getPassword());
//		System.out.println(d.getDob());
//		System.out.println(d.getEmail());
//		System.out.println(d.getDeveloperKey());
		
		
	}
}
