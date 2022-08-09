import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Example1 obj1 = new Example1();
		System.out.println("This is example2");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = s.nextInt();
		System.out.println("Enter the second number:");
		int num2 = s.nextInt();
		
		int result = obj1.addition(num1, num2);
		if(result < 0) {
			System.out.println("Negative number");
		}
		System.out.println("Result:");
		System.out.println(result);
	}

}
