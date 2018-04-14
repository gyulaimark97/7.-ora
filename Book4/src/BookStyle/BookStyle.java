	package BookStyle;
import Book.Book;
public class BookStyle extends Book{

	private String style;
	
	public BookStyle(String title, String author, double price, int numberOfpages,String style) {
		super(title,author,price,numberOfpages);
		this.style=style;
	}

	public String getStyle() {
		return style;
	}
	
	public String toString() {
		return super.toString()+ " Style: "+style;
	}
}
