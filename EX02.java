import java.util.Scanner;

public class EX02 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("논리 연산을 입력하세요 : ");
		boolean op1 = sc.nextBoolean();
		String op = sc.next();
		boolean op2 = sc.nextBoolean();
		
		switch(op) { // 문자열, 문자, 정수
		case "AND":
			System.out.println(op1&&op2);
			break;
		case "OR":
			System.out.println(op1||op2);
			break;
		default:
			System.out.println("잘못된 입력");
		}
		
		sc.close();
	}
}
