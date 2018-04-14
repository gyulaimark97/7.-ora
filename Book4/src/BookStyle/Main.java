package BookStyle;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		
		BookStyle [] books=new BookStyle[n];
		
		for(int i=0;i<n;i++) {
			books[i]=new BookStyle(scan.next(),scan.next(),scan.nextDouble(),scan.nextInt(), scan.next());
		}
		String []styles=new String [10]; {
				styles[0]="Scifi";
				styles[1]="Mystery";
				styles[2]="Adventure";
				styles[3]="Novel";
				styles[4]="Drama";
				styles[5]="Action";
				styles[6]="Horror";
				styles[7]="Comic";
				styles[8]="Comedy";
				styles[9]="Romantic";
				
		}
		int[] styleCounter= new int [10];
		
		for(int i=0;i<n;i++) {
			if(books[i].getStyle().equalsIgnoreCase("Scifi"))
				System.out.println(books[i].toString());
		}
		

		
		for(int i=0;i<n;i++){
			for(int j=0;j<styleCounter.length;j++) {
				if(books[i].getStyle().equalsIgnoreCase(styles[j]))
					styleCounter[j]++;
			}	
		}
		
		for(int i =0;i<styles.length;i++) {
			System.out.println("Number of "+ styles[i]+ " books: "  +styleCounter[i]);
		}
			
		
		int counter=0;
		double avarage=0;
		for(int i=0;i<books.length;i++) {
			
			if(books[i].getStyle().equalsIgnoreCase("Scifi")) {
				avarage=avarage+books[i].getPrice();
				counter++;
			}
			
		}
		if(counter!=0)
			avarage/=counter;
		System.out.println("Avarage Scifi price:"+avarage);
		
		scan.close();
	}
}
