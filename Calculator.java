import java.util.Scanner;
public class Calculator {

		public int Sum(int num1, int num2)
		{
			return num1+num2;
		}
		
		public int Subtract(int num1, int num2)
		{
			return num1-num2;
		}
		
		public int Multiply(int num1, int num2)
		{
			return num1*num2;
		}
		
		public int Divide(int num1, int num2)
		{
			if(num2==0)
			{
				throw new IllegalArgumentException("Cannot divide by zero!!!!");
			}
			return num1/num2;
		}
		
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int num1,num2;
			System.out.println("Enter the first number: ");
			num1 = sc.nextInt();
			System.out.println("Enter the second number: ");
			num2 = sc.nextInt();
			Calculator cal =new Calculator();
			System.out.println("Addition of 2 numbers is: " + cal.Sum(num1, num2));
			System.out.println("Subtraction of 2 numbers is: " + cal.Subtract(num1, num2));
			System.out.println("Multiplication of 2 numbers is: " + cal.Multiply(num1, num2));
			System.out.println("Division of 2 numbers is: " + cal.Divide(num1, num2));
			sc.close();
		}

	}

