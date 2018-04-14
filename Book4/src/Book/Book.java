package Book;

public class Book {

	private String title;
	private String author;
	private final int releaseDate;
	private double price;
	private int numberOfPages;
	private static String publisher="Móra";
	
	java.util.Date today= new java.util.Date();
	static java.time.LocalDate currentDate=java.time.LocalDate.now();
	static int year=currentDate.getYear();
	
	
	public Book(String title, String author, double price, int numberOfpages) {
		this.title=title;
		this.author=author;
		this.releaseDate=year;
		this.price=price;
		this.numberOfPages=numberOfpages;
	}
	
	public Book(String title, String author) {
		this(title,author,year,2500);
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getReleaseDate() {
		return releaseDate;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void priceIncrase(double percent) {
		this.price*=1+(percent/100);
	}
	
	
	
	
	
	
	
	
	
	
	public int getNumberOfPages() {
		return numberOfPages;
	}

	public String toString() {
		return "Cím: "+this.title+" Szerző: "+this.author+ " Kiadás éve: "+this.releaseDate+" Ár: "+this.price+ " Oldalak száma: "+ numberOfPages+ " Kiadó: "+publisher;
	}
	
	public boolean isTitleMatch(Book otherBook) {
		return this.title.equals(otherBook.title);
	}
	
	public Book longerBook(Book book1, Book book2) {
		if(book1.numberOfPages>book2.numberOfPages)
			return book1;
		else
			return book2;
	}
	
	public boolean isNumberOfPagesEven(){
		if((this.numberOfPages%2)==0)
			return true;
		else
			return false;
	}
}
