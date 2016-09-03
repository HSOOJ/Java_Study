package GooGooDan;

public class GooGooDan {

	int a;
	int b;
	
	public GooGooDan(int a, int b){
		this.a = a;
		this.b = b;
		
	}
	
	public int calculate(){
		return a*b;
	}
	public void printDan(int a){
		for (int i = 1; i<=9; i++){
			System.out.println(a+" * "+i+" = "+a*i);
		}
	}
	
	public static void printAll(){
		for(int i = 2; i <= 9; i ++){
			for(int j = 1; j <= 9; j++){
				System.out.println(i+" * "+j+" = "+i*j);
			}
		}
	}
}