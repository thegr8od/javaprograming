package project01;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		method1();
		method2();
	}
	
	static void method1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = scan.nextInt();
		switch(score/10) {
		case 10 : System.out.println("���� : A"); //����ó�� ���ص� �Ǳ� ������
		break;
		case 9 : System.out.println("���� : A");
		break;
		case 8 : System.out.println("���� : B");
		break;
		case 7 : System.out.println("���� : C");
		break;
		case 6 : System.out.println("���� : D");
		break;
		default:
			System.out.println("���� : F");
		}
		
		
	}
	
	static void method2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�ϼ��� �˰� ���� ���� �Է��Ͻÿ�: ");
		int month = scan.nextInt();
		int day = 31;
		switch(month) {
		case 1:case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("���� ������: "+ day);
		case 4:case 6: case 9: case 11: System.out.println("���� ������: " + (day-1));
		case 2: System.out.println("���� ������: "+ (day-3));
		}
	
	}
}
