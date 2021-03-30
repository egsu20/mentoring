import java.net.*;
import java.util.Scanner;
import java.io.*;

public class EX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1~99 사이의 정수를 입력(음수 입력 시 종료): ");
			int n = sc.nextInt(); // 하나의 정수 값을 받음
			if(n < 0) break;

			int first = n / 10; // 10의 자리
			int second = n % 10; // 1의 자리
			
			int firstMod = 1, secondMod = 1; // 값들이 3의 배수인지 확인하기 위한 변수
			 
			if (first != 0) // first가 0이면 십의 자리에 값이 없는 것
				firstMod = first % 3; // 값이 0이면 3, 6, 9 중 하나인 것
			
			if(second != 0) // second의 값이 없다면 second의 값은 1로 유지
				secondMod = second % 3;
			
			if(firstMod == 0 && secondMod ==0)
				System.out.println("박수 짝짝");
			else if(firstMod != 0 && secondMod != 0)
				System.out.println("박수 없음");
			else
				System.out.println("박수 짝"); // 둘 중 하나만 3의 배수
		}
		
		sc.close();
	}
}
