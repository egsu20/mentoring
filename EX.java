import java.net.*;
import java.util.Scanner;
import java.io.*;

public class EX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1~99 ������ ������ �Է�(���� �Է� �� ����): ");
			int n = sc.nextInt(); // �ϳ��� ���� ���� ����
			if(n < 0) break;

			int first = n / 10; // 10�� �ڸ�
			int second = n % 10; // 1�� �ڸ�
			
			int firstMod = 1, secondMod = 1; // ������ 3�� ������� Ȯ���ϱ� ���� ����
			 
			if (first != 0) // first�� 0�̸� ���� �ڸ��� ���� ���� ��
				firstMod = first % 3; // ���� 0�̸� 3, 6, 9 �� �ϳ��� ��
			
			if(second != 0) // second�� ���� ���ٸ� second�� ���� 1�� ����
				secondMod = second % 3;
			
			if(firstMod == 0 && secondMod ==0)
				System.out.println("�ڼ� ¦¦");
			else if(firstMod != 0 && secondMod != 0)
				System.out.println("�ڼ� ����");
			else
				System.out.println("�ڼ� ¦"); // �� �� �ϳ��� 3�� ���
		}
		
		sc.close();
	}
}
