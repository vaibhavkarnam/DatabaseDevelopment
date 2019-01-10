package JDBC.test;

import JDBC.dao.DeveloperDao;
import JDBC.dao.PageDao;
import JDBC.dao.RoleDao;
import JDBC.dao.WebsiteDao;
import JDBC.dao.WidgetDao;
import JDBC.model.Developer;
import JDBC.model.HeadingWidget;
import JDBC.model.HtmlWidget;
import JDBC.model.ImageWidget;
import JDBC.model.Page;
import JDBC.model.Website;
import JDBC.model.Widget;
import JDBC.model.YoutubeWidget;

/**
 * The Class hw_jdbc_karnam_vaibhav.
 */
public class hw_jdbc_karnam_vaibhav {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]){

// excersie your data model and dao

//1
	Developer alice = new Developer("Alice","Wonder","alice","alice","alice@wonder.com","4321rewq");
	Developer bob = new Developer("Bob","Marley","bob","bob","bob@marley.com","5432trew");
	Developer charlie = new Developer("Charles","Garcia","charlie","charlie","church@garcia.com","6543ytre");
	Developer dan = new Developer("Dan","Martin","dan","dan","dan@martin.com","7654fda");
	Developer ed = new Developer("Ed","Karaz","dan","dan","ed@kar.com","5678dfgh");
//
//
	DeveloperDao devdao = new DeveloperDao();
	devdao.createDeveloper(alice);
	devdao.createDeveloper(bob);
	devdao.createDeveloper(charlie);
	devdao.createDeveloper(dan);
	devdao.createDeveloper(ed);
//2		
	Website facebook = new Website("Facebook","an online social media and social networking service",1234234,1);
	Website Twitter = new Website("Twitter","an online news and social networking service",4321543,2);
	Website Wikipedia = new Website("Wikipedia","a free online encyclopedia",3456654,3);
	Website CNN = new Website("CNN","an American basic cable and satellite television news channel",6543345,1);
	Website CNET = new Website("CNET","an American media website that publishes reviews, news, articles, blogs, podcasts and videos on technology and consumer electronics",5433455,2);
	Website Gizmodo = new Website("Gizmodo","a design, technology, science and science fiction website that also writes articles on politics",4322345,3);


//	
	WebsiteDao webdao = new WebsiteDao();
	webdao.createWebsite(1, facebook);
	webdao.createWebsite(2, Twitter);
	webdao.createWebsite(3, Wikipedia);
	webdao.createWebsite(1, CNN);
	webdao.createWebsite(2, CNET);
	webdao.createWebsite(3, Gizmodo);

	
	RoleDao roledao = new RoleDao();
	roledao.assignWebsiteRole(2, 1, "editor");
	roledao.assignWebsiteRole(3, 1, "admin");
	roledao.assignWebsiteRole(3, 2, "editor");
	roledao.assignWebsiteRole(1, 2, "admin");
	roledao.assignWebsiteRole(1, 3, "editor");
	roledao.assignWebsiteRole(2, 3, "admin");
	roledao.assignWebsiteRole(2, 4, "editor");
	roledao.assignWebsiteRole(3, 4, "admin");
	roledao.assignWebsiteRole(3, 5, "editor");
	roledao.assignWebsiteRole(1, 5, "admin");
	roledao.assignWebsiteRole(1, 6, "editor");
	roledao.assignWebsiteRole(2, 6, "admin");

//3
	Page Home = new Page("Home","Landing page",123434);
	Page About = new Page("About","Website description",234545);
	Page Contact = new Page("Contact","Addresses, phones, and contact info",345656);
	Page Preferences = new Page("Preferences","Where users can configure their preferences",456776);
	Page Profile = new Page("Profile","Users can configure their personal information",567878);

	
		
	PageDao pagedao = new PageDao();
	pagedao.createPage(5, Home);
	pagedao.createPage(6, About);
	pagedao.createPage(3, Contact);
	pagedao.createPage(4, Preferences);
	pagedao.createPage(5, Profile);
//	

//	
	roledao.assignPageRole(1, 1, "editor");
	roledao.assignPageRole(2, 1, "reviewer");
	roledao.assignPageRole(3, 1, "writer");
	roledao.assignPageRole(2, 2, "editor");
	roledao.assignPageRole(3, 2, "reviewer");
	roledao.assignPageRole(1, 2, "writer");
	roledao.assignPageRole(3, 3, "editor");
	roledao.assignPageRole(1, 3, "reviewer");
	roledao.assignPageRole(2, 3, "writer");	
	roledao.assignPageRole(1, 4, "editor");
	roledao.assignPageRole(2, 4, "reviewer");
	roledao.assignPageRole(3, 4, "writer");	
	roledao.assignPageRole(2, 5, "editor");
	roledao.assignPageRole(3, 5, "reviewer");
	roledao.assignPageRole(1, 5, "writer");	

//4
	Widget heading = new HeadingWidget("head123",0,0,"Welcome",0,"heading",0);
	Widget html = new HtmlWidget("post123",0,0,"<p>Lorem</p>",0,"html");
	Widget heading345 = new HeadingWidget("head345",0,0,"Hello",1,"heading",0);
	Widget html345 = new HtmlWidget("intro456",0,0,"<h1>Hi</h1>",2,"html");
	Widget image = new ImageWidget("image345",50,100,null,3,"image","/img/567.png");
	Widget youtube = new YoutubeWidget("video456",400,300,null,0,"youtube","https://youtu.be/h67VX51QXiQ",false,false);
	
//
//	
	WidgetDao widgetdao = new WidgetDao();
	widgetdao.createWidget(1, heading);
	widgetdao.createWidget(2, html);
	widgetdao.createWidget(3, heading345);
	widgetdao.createWidget(3, html345);
	widgetdao.createWidget(3, image);
	widgetdao.createWidget(4, youtube);

// UPDATES
	
//1
	
	devdao.updatePhone("charlie", "333-444-5555");

//2
	
	widgetdao.updateWidgetOrder("head345", 3);

//3

 	pagedao.updatePageName("CNET - ","CNET");
	
//4
	roledao.updatePageRole(123, 23, 34);
	
// DELETES

//1
	devdao.deleteAddress("alice");
			
//2
	widgetdao.deleteWidgetForPage("Contact");
	
//3
	pagedao.deleteMaxUpdatePage("Wikipedia");
	
//4
	webdao.deleteWebsiteByName("CNET");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
