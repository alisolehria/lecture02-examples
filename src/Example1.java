import java.util.Scanner;

public class Example1 {
	
	//instance variables
//	private int num1 = 25;
//	private int num2 = 35;
	
	//constructor
	public Example1(){
		
	}
	/**python code:
	def addition(num1, num2):
		return num1 + num2**/
	public int addition(int num1, int num2){
		return num1 + num2;
	}
	


	
	//methods
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = s.nextInt();
		System.out.println("Enter the second number:");
		int num2 = s.nextInt();
		Example1 obj = new Example1();
		int result = obj.addition(num1, num2);
		if(result < 0) {
			System.out.println("Negative number");
		}
		String textResult = "Result of adding "+num1+" and "+num2+" :";
		System.out.println(textResult);
		System.out.println(result);
		
	}

}
