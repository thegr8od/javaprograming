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
		System.out.print("성적을 입력하시오: ");
		int score = scan.nextInt();
		switch(score/10) {
		case 10 : System.out.println("학점 : A"); //예외처리 안해도 되기 때문에
		break;
		case 9 : System.out.println("학점 : A");
		break;
		case 8 : System.out.println("학점 : B");
		break;
		case 7 : System.out.println("학점 : C");
		break;
		case 6 : System.out.println("학점 : D");
		break;
		default:
			System.out.println("학점 : F");
		}
		
		
	}
	
	static void method2()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("일수를 알고 싶은 월을 입력하시오: ");
		int month = scan.nextInt();
		int day = 31;
		switch(month) {
		case 1:case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("월의 날수는: "+ day);
		case 4:case 6: case 9: case 11: System.out.println("월의 날수는: " + (day-1));
		case 2: System.out.println("월의 날수는: "+ (day-3));
		}
	
	}
}
