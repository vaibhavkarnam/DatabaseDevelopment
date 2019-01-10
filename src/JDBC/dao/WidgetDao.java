package JDBC.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import JDBC.model.HeadingWidget;
import JDBC.model.HtmlWidget;
import JDBC.model.ImageWidget;
import JDBC.model.Widget;
import JDBC.model.YoutubeWidget;

/**
 * The Class WidgetDao.
 */
public class WidgetDao extends BaseDao{

	/** The create widget. */
	final String CREATE_WIDGET = "INSERT INTO WIDGET (name, width, height, cssClass, cssStyle, text, WidgetOrder, type, url, shareable, expandable, src, size, widgetcol, html, page) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	/** The find all widgets. */
	final String FIND_ALL_WIDGETS = "SELECT * FROM WIDGET";
	
	/** The find widget. */
	final String FIND_WIDGET = "SELECT * FROM WIDGET WHERE id = ?";
	
	/** The find widgets for page. */
	final String FIND_WIDGETS_FOR_PAGE = "SELECT * FROM WIDGET WHERE page = ?";
	
	/** The update widget. */
	final String UPDATE_WIDGET = "UPDATE WIDGET SET name =?,width =?, height=?, cssClass=?, cssStyle=?, text=?, WidgetOrder=?, type=?, url=?, shareable=?, expandable=?, src=?, size=?, widgetcol=?, html=? WHERE id = ?";
	
	/** The delete widget. */
	final String DELETE_WIDGET = "DELETE FROM WIDGET WHERE id = ?";
	
	/** The find widget by name. */
	final String FIND_WIDGET_BY_NAME = "SELECT * FROM WIDGET WHERE name = ?";
	
	/** The update widget order. */
	final String UPDATE_WIDGET_ORDER = "UPDATE WIDGET SET WidgetOrder = WidgetOrder-1 WHERE WidgetOrder > ? AND WidgetOrder <= ?";
	
	/** The update order of widget. */
	final String UPDATE_ORDER_OF_WIDGET = "UPDATE WIDGET SET WidgetOrder = ? Where name = ?";
	
	/** The delete last widget. */
	final String DELETE_LAST_WIDGET = "DELETE FROM widget WHERE page = (SELECT id from page WHERE title = ? ) AND widget.WidgetOrder = (SELECT max(widgetorder) FROM (SELECT max(widget.WidgetOrder) AS widgetorder FROM widget)as w)";
	
	/**
	 * Creates the widget.
	 *
	 * @param pageId the page id
	 * @param widget the widget
	 * @return the int
	 */
	public int createWidget(int pageId, Widget widget){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(CREATE_WIDGET);
			statement.setString(1, widget.getName());
			statement.setInt(2, widget.getWidth());
			statement.setInt(3, widget.getHeight());
			statement.setString(4, widget.getCssClass());
			statement.setString(5, widget.getCssStyle());
			statement.setString(6, widget.getText());
			statement.setInt(7, widget.getOrder());
			statement.setString(8, widget.getType());
			statement.setString(9, widget.getUrl());
			statement.setBoolean(10, widget.getShareable());
			statement.setBoolean(11, widget.getExpandable());
			statement.setString(12, widget.getSrc());
			statement.setInt(13, widget.getSize());
			statement.setString(14, widget.getWidgetCol());
			statement.setString(15, widget.getHtml());
			statement.setInt(16,pageId);
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
	 * Find all widgets.
	 *
	 * @return the array list
	 */
	public ArrayList<Widget> findAllWidgets(){
		PreparedStatement statement =null;
		ArrayList<Widget> widgets = new ArrayList<>();
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_ALL_WIDGETS);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				Widget widget = new Widget();
				String name = rs.getString("name");
				int Height = rs.getInt("height");
				int Width = rs.getInt("width");
				String text = rs.getString("text");
				int order = rs.getInt("WidgetOrder");
				String cssClass = rs.getString("cssClass");
				String cssStyle = rs.getString("cssStyle");				
				String type = rs.getString("type");
				int page = rs.getInt("page");
				if(type.equals("youtube"))
				{
				widget = new YoutubeWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("url")), (rs.getBoolean("shareable")), (rs.getBoolean("expandable")));
				}
				else if(type.equals("heading")){
				widget =  new HeadingWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type,(rs.getInt("size")));
				}
				else if(type.equals("html")){
				widget = new HtmlWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("html")));
				}
				else if(type.equals("image"))
				{
				widget = new ImageWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("src")));
				}
				widgets.add(widget);
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
		return widgets;
	}
	
	/**
	 * Find widgets for page.
	 *
	 * @param pageId the page id
	 * @return the array list
	 */
	public ArrayList<Widget> findWidgetsForPage(int pageId){
		PreparedStatement statement =null;
		ArrayList<Widget> widgets = new ArrayList<>();
		
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_WIDGETS_FOR_PAGE);
			 statement.setInt(1, pageId);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				Widget widget = new Widget();
				String name = rs.getString("name");
				int Height = rs.getInt("height");
				int Width = rs.getInt("width");
				String text = rs.getString("text");
				int order = rs.getInt("WidgetOrder");
				String cssClass = rs.getString("cssClass");
				String cssStyle = rs.getString("cssStyle");				
				String type = rs.getString("type");
				int page = rs.getInt("page");
				if(type.equals("youtube"))
				{
				widget = new YoutubeWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("url")), (rs.getBoolean("shareable")), (rs.getBoolean("expandable")));
				}
				else if(type.equals("heading")){
				widget =  new HeadingWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type,(rs.getInt("size")));
				}
				else if(type.equals("html")){
				widget = new HtmlWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("html")));
				}
				else if(type.equals("image"))
				{
				widget = new ImageWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("src")));
				}
				widgets.add(widget);
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
		return widgets;
	}
	
	/**
	 * Find widget by id.
	 *
	 * @param widgetId the widget id
	 * @return the widget
	 */
	public Widget findWidgetById(int widgetId){
		PreparedStatement statement =null;
		Widget widget = new Widget();
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_WIDGET);
				statement.setInt(1, widgetId);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				String name = rs.getString("name");
				int Height = rs.getInt("height");
				int Width = rs.getInt("width");
				String text = rs.getString("text");
				int order = rs.getInt("WidgetOrder");
				String cssClass = rs.getString("cssClass");
				String cssStyle = rs.getString("cssStyle");				
				String type = rs.getString("type");
				int page = rs.getInt("page");
				if(type.equals("youtube"))
				{
				widget = new YoutubeWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("url")), (rs.getBoolean("shareable")), (rs.getBoolean("expandable")));
				}
				else if(type.equals("heading")){
				widget =  new HeadingWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type,(rs.getInt("size")));
				}
				else if(type.equals("html")){
				widget = new HtmlWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("html")));
				}
				else if(type.equals("image"))
				{
				widget = new ImageWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("src")));
				}
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
		return widget;
	}
	
	/**
	 * Find widget by name.
	 *
	 * @param widgetName the widget name
	 * @return the widget
	 */
	public Widget findWidgetByName(String widgetName){
		PreparedStatement statement =null;
		Widget widget = new Widget();
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			 statement = connection.prepareStatement(FIND_WIDGET_BY_NAME);
				statement.setString(1, widgetName);
			ResultSet rs = statement.executeQuery();
			while(rs.next())
			{
				String name = rs.getString("name");
				int Height = rs.getInt("height");
				int Width = rs.getInt("width");
				String text = rs.getString("text");
				int order = rs.getInt("WidgetOrder");
				String cssClass = rs.getString("cssClass");
				String cssStyle = rs.getString("cssStyle");				
				String type = rs.getString("type");
				int page = rs.getInt("page");
				if(type.equals("youtube"))
				{
				widget = new YoutubeWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("url")), (rs.getBoolean("shareable")), (rs.getBoolean("expandable")));
				}
				else if(type.equals("heading")){
				widget =  new HeadingWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type,(rs.getInt("size")));
				}
				else if(type.equals("html")){
				widget = new HtmlWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("html")));
				}
				else if(type.equals("image"))
				{
				widget = new ImageWidget(name, Width, Height, cssClass, cssStyle, text, order, page, type, (rs.getString("src")));
				}
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
		return widget;
	}
	
	
	
	/**
	 * Update widget.
	 *
	 * @param widgetId the widget id
	 * @param widget the widget
	 * @return the int
	 */
	public int updateWidget(int widgetId, Widget widget){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(UPDATE_WIDGET);
			statement.setString(1, widget.getName());
			statement.setInt(2, widget.getWidth());
			statement.setInt(3, widget.getHeight());
			statement.setString(4, widget.getCssClass());
			statement.setString(5, widget.getCssStyle());
			statement.setString(6, widget.getText());
			statement.setInt(7, widget.getOrder());
			statement.setString(8, widget.getType());
			statement.setString(9, widget.getUrl());
			statement.setBoolean(10, widget.getShareable());
			statement.setBoolean(11, widget.getExpandable());
			statement.setString(12, widget.getSrc());
			statement.setInt(13, widget.getSize());
			statement.setString(14, widget.getWidgetCol());
			statement.setString(15, widget.getHtml());
			statement.setInt(16,widgetId);
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
	 * Update widget order.
	 *
	 * @param widgetName the widget name
	 * @param newOrder the new order
	 * @return the int
	 */
	public int updateWidgetOrder(String widgetName, int newOrder){
		Widget widget = findWidgetByName(widgetName);
		int oldOrder = widget.getOrder();
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(UPDATE_WIDGET_ORDER);
			statement.setInt(1, oldOrder);
			statement.setInt(2, newOrder);
			result = statement.executeUpdate();
			statement = connection.prepareStatement(UPDATE_ORDER_OF_WIDGET);
			statement.setInt(1, newOrder);
			statement.setString(2, widgetName);
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
	 * Delete widget.
	 *
	 * @param widgetId the widget id
	 * @return the int
	 */
	public int deleteWidget(int widgetId){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_WIDGET);
			statement.setInt(1, widgetId);
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
	 * Delete widget for page.
	 *
	 * @param pageName the page name
	 * @return the int
	 */
	public int deleteWidgetForPage(String pageName){
		int result = -1;
		try {
			Class.forName(JDBC_DRIVER);
			Connection connection = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			PreparedStatement statement = connection.prepareStatement(DELETE_LAST_WIDGET);
			statement.setString(1, pageName);
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
		WidgetDao widdao = new WidgetDao();
//		Widget widget = new YoutubeWidget("www.wikipedia.com",true,true);
//		widget.setName("Updated");
//		widget.setHeight(670);
//		widget.setWidth(345);
//		widget.setOrder(30);
//		widget.setText("widget  youtube");
//		widget.setType("youtube");
//		widdao.deleteWidget(790);
		
		
//		System.out.println(widget.getOrder());
		
		
		
		
//		dev.setFirstName("vaibhav");
//		dev.setFirstName("Karnam");
//		dev.setDeveloperKey("vaib");
//		dev.setUsername("vaibhav");
//		dev.setPassword("karnam");
//		Website web = new Website("zillow","houses",1234);
//		wdao.createWebsite(12, web);
//		
//		ArrayList<Widget> widgets = widdao.findAllWidgets();
//		for(Widget w : widgets)
//		{
//			System.out.println(w.getName());
//			System.out.println(w.getWidth());
//			System.out.println(w.getHeight());
//			System.out.println(w.getText());
//			System.out.println(w.getType());
//			System.out.println(w.getURL());
//			System.out.println(w.getShareable());
//			System.out.println(w.getExpandable());
//
//
//		}
		
		Widget w = widdao.findWidgetById(678);
		System.out.println(w.getName());
		System.out.println(w.getWidth());
		System.out.println(w.getHeight());
		System.out.println(w.getText());
		System.out.println(w.getType());
		System.out.println(w.getUrl());
		System.out.println(w.getShareable());
		System.out.println(w.getExpandable());
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
