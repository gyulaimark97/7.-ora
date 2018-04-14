package myproduct;

public class Bread extends Product {

	private double amount;
	
	public Bread(String name,int price,int tax,double amount) {
		super (name,price,tax);
		this.amount=amount;
	}
	
	public String toString() {
		return super.toString()+" One-price: "+brutto()/amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	
	public static boolean hasHigherPrice(Bread bread1,Bread bread2) {
		if((bread1.brutto()/bread1.amount)>(bread2.brutto()/bread2.amount))
			return true;
		else 
			return false;
	}
}
