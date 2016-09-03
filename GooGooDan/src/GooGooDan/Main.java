package GooGooDan;

public class Main {

	public static void main(String[] args) {	
		GooGooDan g = new GooGooDan(3, 5);
		
		System.out.println(g.calculate());
		
		g.printDan(6);
		
		GooGooDan.printAll();
	}
	
}
