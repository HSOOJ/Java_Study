package Array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		int array[]; //배열 생성
		
		array = new int[10];
		for (int i = 0; i < 10; i ++){
			System.out.println((i+1)+"번째 숫자를 입력하세요.");
			array[i] = num.nextInt();
		}//배열에 들어갈 숫자 입력받아서 배열에 저장
		
		System.out.print("3의 배수 : ");
		for (int i1 = 0; i1 < array.length; i1++){
			if ((array[i1] % 3) == 0) //3의 배수인지 판정
				System.out.print( array[i1] + " ");
		} //3의 배수만 출력
		
		num.close();
	}
}
