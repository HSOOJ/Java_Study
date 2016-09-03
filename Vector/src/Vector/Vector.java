package Vector;

public class Vector {
	
	double x;
	double y;

	public Vector(double a, double b){
		this.x = a;
		this.y = b;
	}
	
	public void print(){
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	public static String add(Vector a, Vector b){
		double added_a = a.x + b.x;
		double added_b = a.y + b.y;
		String result = "(" + added_a + ", " + added_b + ")";
		return result;
	}
	
	public static String sub(Vector a, Vector b){
		double subbed_a = a.x - b.x;
		double subbed_b = a.y - b.y;
		return "(" + subbed_a + ", " + subbed_b + ")";
	}
	
	public static String mul(Vector a, Vector b){
		double multiplied_a = a.x * b.x;
		double multiplied_b = a.y * b.y;
		return "(" + multiplied_a + ", " + multiplied_b + ")";
	}
	
	public static String div(Vector a, Vector b){
		double divided_a = a.x / b.x;
		double divided_b = a.y / b.y;
		return "(" + divided_a + ", " + divided_b + ")";
	}
}