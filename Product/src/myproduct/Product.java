package myproduct;

public class Product {
	
	private String name;
	private int price;
	private int tax;
	
	
	public Product(String name, int price, int tax) {
		this.name=name;
		this.price=price;
		this.tax=tax;
	}
	
	
	public int brutto() {
		return price+price*(tax/100);
	}
	
	public String toString() {
		return"Name: "+name+ " Brutto price: "+brutto();
	}
	
	public void incPrice(int incPercent) {
		this.price=price+price*(incPercent/100);
	}
	
	public int hasHigherBrutto(Product otherProduct) {
		if(this.brutto()>otherProduct.brutto())
			return 1;
		else if(this.brutto()<otherProduct.brutto())
			return -1;
		else
			return 0;
	}
	
}
