import java.util.Scanner;

public class EX02 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ������ �Է��ϼ��� : ");
		boolean op1 = sc.nextBoolean();
		String op = sc.next();
		boolean op2 = sc.nextBoolean();
		
		switch(op) { // ���ڿ�, ����, ����
		case "AND":
			System.out.println(op1&&op2);
			break;
		case "OR":
			System.out.println(op1||op2);
			break;
		default:
			System.out.println("�߸��� �Է�");
		}
		
		sc.close();
	}
}
