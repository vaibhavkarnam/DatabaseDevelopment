package JDBC.model;

/**
 * The Class YoutubeWidget.
 */
public class YoutubeWidget extends Widget {

	/** The url. */
	private String url;
	
	/** The shareable. */
	private Boolean shareable;
	
	/** The expandable. */
	private Boolean expandable;
	
	/**
	 * Instantiates a new youtube widget.
	 */
	public YoutubeWidget() {
		super();
	}
	
	/**
	 * Instantiates a new youtube widget.
	 *
	 * @param url the url
	 */
	public YoutubeWidget(String url) {
		super();
		this.url = url;
	}
	
	/**
	 * Instantiates a new youtube widget.
	 *
	 * @param url the url
	 * @param shareable the shareable
	 * @param expandable the expandable
	 */
	public YoutubeWidget(String url, Boolean shareable, Boolean expandable) {
		super();
		this.url = url;
		this.shareable = shareable;
		this.expandable = expandable;
	}
	
	/**
	 * Instantiates a new youtube widget.
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
	 * @param url the url
	 * @param shareable the shareable
	 * @param expandable the expandable
	 */
	public YoutubeWidget(String name, Integer width, Integer height, String cssClass, String cssStyle, String text,
			Integer order, int page, String type, String url, Boolean shareable, Boolean expandable) {
		super(name, width, height, cssClass, cssStyle, text, order, page, type);
		this.url = url;
		this.shareable = shareable;
		this.expandable = expandable;
	}
	
	/* (non-Javadoc)
	 * @see JDBC.model.Widget#getUrl()
	 */
	public String getUrl() {
		return url;
	}
	
	/**
	 * Sets the url.
	 *
	 * @param url the new url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	
	/* (non-Javadoc)
	 * @see JDBC.model.Widget#getShareable()
	 */
	public Boolean getShareable() {
		return shareable;
	}
	
	/**
	 * Instantiates a new youtube widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param text the text
	 * @param order the order
	 * @param type the type
	 * @param url the url
	 * @param shareable the shareable
	 * @param expandable the expandable
	 */
	public YoutubeWidget(String name, Integer width, Integer height, String text, Integer order, String type,
			String url, Boolean shareable, Boolean expandable) {
		super(name, width, height, text, order, type);
		this.url = url;
		this.shareable = shareable;
		this.expandable = expandable;
	}
	
	/**
	 * Instantiates a new youtube widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param text the text
	 * @param order the order
	 * @param type the type
	 * @param url the url
	 */
	public YoutubeWidget(String name, Integer width, Integer height, String text, Integer order, String type,
			String url) {
		super(name, width, height, text, order, type);
		this.url = url;
	}
	
	/**
	 * Sets the shareable.
	 *
	 * @param shareable the new shareable
	 */
	public void setShareable(Boolean shareable) {
		this.shareable = shareable;
	}
	
	/* (non-Javadoc)
	 * @see JDBC.model.Widget#getExpandable()
	 */
	public Boolean getExpandable() {
		return expandable;
	}
	
	/**
	 * Sets the expandable.
	 *
	 * @param expandable the new expandable
	 */
	public void setExpandable(Boolean expandable) {
		this.expandable = expandable;
	}
}
