package Array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int array[]; //�迭 ����
		
		array = new int[10];
		for (int i = 0; i < 10; i ++){
			System.out.println((i+1)+"��° ���ڸ� �Է��ϼ���.");
			array[i] = num.nextInt();
		}//�迭�� �� ���� �Է¹޾Ƽ� �迭�� ����
		
		System.out.print("3�� ��� : ");
		for (int i1 = 0; i1 < array.length; i1++){
			if ((array[i1] % 3) == 0) //3�� ������� ����
				System.out.print( array[i1] + " ");
		} //3�� ����� ���
		
		num.close();
	}
}
