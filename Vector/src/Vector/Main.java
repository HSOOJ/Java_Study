package Vector;

public class Main {

	public static void main(String[] args) {
		Vector a = new Vector(1,2);
		Vector b = new Vector(3,4);
		
		a.print();                // (1, 2)
		System.out.println(Vector.add(a, b)); // (4, 6)
		System.out.println(Vector.sub(a, b)); // (-2, -2)
		System.out.println(Vector.mul(a, b)); // (3, 8)
		System.out.println(Vector.div(a, b)); // (0.3333334, 0.5)
	}
}