import java.util.Scanner;
public class Calculator{
	
	
	public static void main(String args[])
	{
		
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers");
double num1=s.nextDouble();
double num2=s.nextDouble();
System.out.println("Enter any 1 operator (+,-,*,/,%) : ");		
char operator=s.next().charAt(0);

		switch(operator)
		{
		case '+' :
			System.out.println(num1+num2);
			break;
		case '-' :
			System.out.println(num1-num2);
			break;
		case '*' :
			System.out.println(num1*num2);
			break;
		case '/' :
			System.out.println(num1/num2);
			break;
		case '%' :
			System.out.println(num1%num2);
			break;
		
		
	}

	}	
}