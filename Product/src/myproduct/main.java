package myproduct;

public class main {

	public static void main(String[] args) {
		Product product= new Product("something",1220,27);
		Bread whiteBread=new Bread("white bread",270,12,1.00);
		
		System.out.println(product.toString());
		System.out.println(whiteBread.toString());
		
		Product product2=new Bread("brown bread",320,12,0.75);
		//System.out.println(product2.getAmount);
		System.out.println(product2.toString());
		Bread bread2= new Bread("seedy bread",320,12,1);
		
		if(Bread.hasHigherPrice(bread2, (Bread)(product2)))
			System.out.println(bread2.toString());
		else
			System.out.println(product2.toString());
	}

}
