package JDBC.model;


/**
 * The Class HeadingWidget.
 */
public class HeadingWidget extends Widget {

	/** The size. */
	private Integer size;

	/**
	 * Instantiates a new heading widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param text the text
	 * @param order the order
	 * @param type the type
	 */
	public HeadingWidget(String name, Integer width, Integer height, String text, Integer order, String type) {
		super(name, width, height, text, order, type);
	}

	/* (non-Javadoc)
	 * @see JDBC.model.Widget#getSize()
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size the new size
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * Instantiates a new heading widget.
	 *
	 * @param name the name
	 * @param width the width
	 * @param height the height
	 * @param text the text
	 * @param order the order
	 * @param type the type
	 * @param size the size
	 */
	public HeadingWidget(String name, Integer width, Integer height, String text, Integer order, String type,
			Integer size) {
		super(name, width, height, text, order, type);
		this.size = size;
	}

	/**
	 * Instantiates a new heading widget.
	 *
	 * @param size the size
	 */
	public HeadingWidget(Integer size) {
		super();
		this.size = size;
	}

	/**
	 * Instantiates a new heading widget.
	 */
	public HeadingWidget() {
		super();
	}

	/**
	 * Instantiates a new heading widget.
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
	 * @param size the size
	 */
	public HeadingWidget(String name, Integer width, Integer height, String cssClass, String cssStyle, String text,
			Integer order, int page, String type, Integer size) {
		super(name, width, height, cssClass, cssStyle, text, order, page, type);
		this.size = size;
	}
	
	
}
