package JDBC.model;

/**
 * The Class Widget.
 */
public class Widget {

	/** The name. */
	private String name;
	
	/** The width. */
	private Integer width;
	
	/** The height. */
	private Integer height;
	
	/** The css class. */
	private String cssClass;
	
	/** The css style. */
	private String cssStyle;
	
	/** The text. */
	private String text;
	
	/** The order. */
	private Integer order;
	
	/** The page. */
	private int page;
	
	/** The type. */
	private String type;
	
	/** The widget col. */
	private String widgetCol;
	
	/**
	 * Gets the widget col.
	 *
	 * @return the widget col
	 */
	public String getWidgetCol() {
		return widgetCol;
	}
	
	/**
	 * Sets the widget col.
	 *
	 * @param widgetCol the new widget col
	 */
	public void setWidgetCol(String widgetCol) {
		this.widgetCol = widgetCol;
	}
	
	/**
	 * Instantiates a new widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param cssClass the css class
	 * @param cssStyle the css style
	 * @param text the text
	 * @param order the order
	 * @param page the page
	 * @param type the type
	 */
	public Widget(String name, Integer width, Integer height, String cssClass, String cssStyle, String text,
			Integer order, int page, String type) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.cssClass = cssClass;
		this.cssStyle = cssStyle;
		this.text = text;
		this.order = order;
		this.page = page;
		this.type = type;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Instantiates a new widget.
	 */
	public Widget() {
		super();
	}
	
	/**
	 * Instantiates a new widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param text the text
	 * @param page the page
	 */
	public Widget(String name, Integer width, Integer height, String text, int page) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.text = text;
		this.page = page;
	}
	
	/**
	 * Instantiates a new widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param cssClass the css class
	 * @param cssStyle the css style
	 * @param text the text
	 * @param order the order
	 * @param page the page
	 */
	public Widget(String name, Integer width, Integer height, String cssClass, String cssStyle, String text,
			Integer order, int page) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.cssClass = cssClass;
		this.cssStyle = cssStyle;
		this.text = text;
		this.order = order;
		this.page = page;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public Integer getWidth() {
		return width;
	}
	
	/**
	 * Sets the width.
	 *
	 * @param width the new width
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
	
	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public Integer getHeight() {
		return height;
	}
	
	/**
	 * Sets the height.
	 *
	 * @param height the new height
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	/**
	 * Gets the css class.
	 *
	 * @return the css class
	 */
	public String getCssClass() {
		return cssClass;
	}
	
	/**
	 * Sets the css class.
	 *
	 * @param cssClass the new css class
	 */
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}
	
	/**
	 * Gets the css style.
	 *
	 * @return the css style
	 */
	public String getCssStyle() {
		return cssStyle;
	}
	
	/**
	 * Sets the css style.
	 *
	 * @param cssStyle the new css style
	 */
	public void setCssStyle(String cssStyle) {
		this.cssStyle = cssStyle;
	}
	
	/**
	 * Gets the text.
	 *
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Sets the text.
	 *
	 * @param text the new text
	 */
	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * Gets the order.
	 *
	 * @return the order
	 */
	public Integer getOrder() {
		return order;
	}
	
	/**
	 * Sets the order.
	 *
	 * @param order the new order
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}
	
	/**
	 * Gets the page.
	 *
	 * @return the page
	 */
	public int getPage() {
		return page;
	}
	
	/**
	 * Sets the page.
	 *
	 * @param page the new page
	 */
	public void setPage(int page) {
		this.page = page;
	}
	
	/**
	 * Gets the url.
	 *
	 * @return the url
	 */
	public String getUrl() {
		return null;
	}

	/**
	 * Gets the shareable.
	 *
	 * @return the shareable
	 */
	public Boolean getShareable() {
		return false;
	}

	/**
	 * Gets the expandable.
	 *
	 * @return the expandable
	 */
	public Boolean getExpandable() {
		return false;
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public Integer getSize() {
		return 0;
	}
	
	/**
	 * Gets the html.
	 *
	 * @return the html
	 */
	public String getHtml() {
		return null;
	}
	
	/**
	 * Gets the src.
	 *
	 * @return the src
	 */
	public String getSrc() {
		return null;
	}
	
	/**
	 * Instantiates a new widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param text the text
	 * @param order the order
	 * @param type the type
	 */
	public Widget(String name, Integer width, Integer height, String text, Integer order, String type) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.text = text;
		this.order = order;
		this.type = type;
	}
}
