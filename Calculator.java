import java.util.Scanner;

class Calculator
{
	public static void main (String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		float number1 ,number2, result = 0;
		
		System.out.println("Enter your number1: ");
		number1 = scanner.nextFloat();
		
		System.out.println("Enter the number2: ");
		number2 = scanner.nextFloat();
		scanner.nextLine();
		
		System.out.println("Enter your the operation(+, -, *, /, %): ");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		if (operation == "+")
		{
			result = number1 + number2;
		}
		else if (operation == "-")
		{
			result = number1 - number2;
		}
		else if (operation == "*")
		{
			result = number1 * number2;
		}
		else if (operation == "/")
		{
			result = number1 / number2;
		}
		else if (operation == "%")
		{
			result = number1 % number2;
		}
		else
		{
			System.out.println("Sorry!! Try Again.");
		}
		
		System.out.println("Result:" + result);
		
		scanner.close();
	}
}