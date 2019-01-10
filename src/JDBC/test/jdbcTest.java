package JDBC.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * The Class jdbcTest.
 */
public class jdbcTest {
	
	/** The Constant JDBC_DRIVER. */
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	
	/** The Constant DB_URL. */
	static final String DB_URL = "jdbc:mysql://localhost/test?autoReconnect=true&useSSL=false";
	
	/** The Constant USERNAME. */
	static final String USERNAME = "root";
	
	/** The Constant PASSWORD. */
	static final String PASSWORD = "vk1789mkak";
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException the SQL exception
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		Class.forName(JDBC_DRIVER);
		Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
		String sql = "SELECT * FROM person WHERE username =?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "alice");
//		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("id");
			String username = rs.getString("username");
			String password = rs.getString("password");
			String first = rs.getString("firstName");
			String last = rs.getString("lastName");
			System.out.println("firstname:"+first+"\t"+"lastname"+last);
		}
		
		rs.close();
		statement.close();
		connection.close();
	}
}
