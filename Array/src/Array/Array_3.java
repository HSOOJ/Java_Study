package Array;

import java.util.Scanner;

public class Array_3 {

	public static void main(String[] args) {
		System.out.print("�ݾ��� �Է��Ͻÿ� : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int m;
		m = num/50000;
		System.out.print("��������:" + m +" " );
		m = ((num%50000)/10000);
		System.out.print("����:" + m+" " );
		m = ((num%10000)/1000);
		System.out.print("õ��:" + m+" ");
		m = ((num%1000)/100);
		System.out.print("���:" + m+" ");
		m = ((num % 100)/50);
		System.out.print("���ʿ�:" + m+" ");
		m = ((num % 50)/10);
		System.out.print("�ʿ�:" + m+" ");
		m = num % 10;
		System.out.print("�Ͽ�:" + m+" ");
	}

}
