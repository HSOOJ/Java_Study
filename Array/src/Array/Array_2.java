package Array;

public class Array_2 {

	public static void main(String[] args) {
		
		int[] [] num = new int [4][4]; //4*4 �迭 ����
		
		for (int i = 0; i < num.length; i ++){
			for (int j = 0; j < num[i].length; j ++){
				for (int k = 0; k < 10; k ++){
					int random = (int)(Math.random() *10)+1;
					// 1���� 10���� ���� �������� ���� 
			
					num[i][j] = random;
					// ������ ���� �迭�� ����
			}
		}
	}
		for (int i = 0; i < num.length; i++){
			System.out.println();
			for (int j = 0; j < num[i].length; j++){
				System.out.print(num[i][j] + " ");
			} // �迭 ���
		}

	}

}
