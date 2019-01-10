package JDBC.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * The Class BaseDao.
 */
public class BaseDao{
	
	/** The Constant JDBC_DRIVER. */
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	
	/** The Constant DB_URL. */
	static final String DB_URL = "jdbc:mysql://localhost/test?autoReconnect=true&useSSL=false";
	
	/** The Constant USERNAME. */
	static final String USERNAME = "root";
	
	/** The Constant PASSWORD. */
	static final String PASSWORD = "vk1789mkak";
	
	/** The connection. */
	Connection connection = null;
	
	/** The statement. */
	PreparedStatement statement = null;
	
}
