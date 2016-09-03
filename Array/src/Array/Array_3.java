package Array;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		System.out.print("금액을 입력하시오 : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int m;
		m = num/50000;
		System.out.print("오만원권:" + m +" " );
		m = ((num%50000)/10000);
		System.out.print("만원:" + m+" " );
		m = ((num%10000)/1000);
		System.out.print("천원:" + m+" ");
		m = ((num%1000)/100);
		System.out.print("백원:" + m+" ");
		m = ((num % 100)/50);
		System.out.print("오십원:" + m+" ");
		m = ((num % 50)/10);
		System.out.print("십원:" + m+" ");
		m = num % 10;
		System.out.print("일원:" + m+" ");
	}

}
