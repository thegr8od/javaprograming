import java.util.Scanner;

public class main {
	static void method1() {
		
		Scanner scan = new Scanner(System.in);
		Account1 account1 = new Account1("Account1");
		Account1 account2 = new Account1("Account2");
		System.out.print("Enter deposit amount for " + account1.getName() + ": ");
		double deposit1 = scan.nextDouble();
		account1.credit(deposit1);
		System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());

		System.out.print("Enter deposit amount for " + account2.getName() + ": ");
		double deposit2 = scan.nextDouble();
		account2.credit(deposit2);
		System.out.printf("%s balance: %.2f%n", account2.getName(), account2.getBalance());
		System.out.println();
		
	}

	static void method2() {
		
		Account1 account = new Account1("홍길동");
		account.credit(1000.0);
		account.print();
		
		account.addInterest(0.011);
		account.print();
		System.out.println();

	}

	static void method3() {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int n1 = scan.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = scan.nextInt();

		int sum = n1 + n2;

		int product = n1 * n2;

		int difference = n1 - n2;

		int quotient = 0;

		if (n2 != 0) { // 0이 아닐경우에만 나눔
			quotient = n1 / n2;
		}

		System.out.println();
		System.out.println("Sum is " + sum);
		System.out.println("Product is " + product);
		System.out.println("Difference is " + difference);
		System.out.println("Quotient is " + quotient);
		
	}

	public static void main(String[] args) {
		method1();
		method2();
		method3();
	}

}