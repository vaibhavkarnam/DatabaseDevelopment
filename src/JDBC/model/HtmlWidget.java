package JDBC.model;

/**
 * The Class HtmlWidget.
 */
public class HtmlWidget extends Widget {

	/** The html. */
	private String html;

	/**
	 * Instantiates a new html widget.
	 */
	public HtmlWidget() {
		super();
	}

	/**
	 * Instantiates a new html widget.
	 *
	 * @param html the html
	 */
	public HtmlWidget(String html) {
		super();
		this.html = html;
	}

	/**
	 * Instantiates a new html widget.
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
	 * @param html the html
	 */
	public HtmlWidget(String name, Integer width, Integer height, String cssClass, String cssStyle, String text,
			Integer order, int page, String type, String html) {
		super(name, width, height, cssClass, cssStyle, text, order, page, type);
		this.html = html;
	}

	/**
	 * Instantiates a new html widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param text the text
	 * @param order the order
	 * @param type the type
	 */
	public HtmlWidget(String name, Integer width, Integer height, String text, Integer order, String type) {
		super(name, width, height, text, order, type);
	}

	/* (non-Javadoc)
	 * @see JDBC.model.Widget#getHtml()
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * Sets the html.
	 *
	 * @param html the new html
	 */
	public void setHtml(String html) {
		this.html = html;
	}
}
