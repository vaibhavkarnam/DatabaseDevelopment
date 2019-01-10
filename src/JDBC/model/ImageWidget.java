package JDBC.model;

/**
 * The Class ImageWidget.
 */
public class ImageWidget extends Widget {

	/** The src. */
	private String src;

	/**
	 * Instantiates a new image widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param text the text
	 * @param order the order
	 * @param type the type
	 * @param src the src
	 */
	public ImageWidget(String name, Integer width, Integer height, String text, Integer order, String type,
			String src) {
		super(name, width, height, text, order, type);
		this.src = src;
	}

	/* (non-Javadoc)
	 * @see JDBC.model.Widget#getSrc()
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * Sets the src.
	 *
	 * @param src the new src
	 */
	public void setSrc(String src) {
		this.src = src;
	}

	/**
	 * Instantiates a new image widget.
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
	 * @param src the src
	 */
	public ImageWidget(String name, Integer width, Integer height, String cssClass, String cssStyle, String text,
			Integer order, int page, String type, String src) {
		super(name, width, height, cssClass, cssStyle, text, order, page, type);
		this.src = src;
	}

	/**
	 * Instantiates a new image widget.
	 *
	 * @param src the src
	 */
	public ImageWidget(String src) {
		super();
		this.src = src;
	}

	/**
	 * Instantiates a new image widget.
	 */
	public ImageWidget() {
		super();
	}
	
}
