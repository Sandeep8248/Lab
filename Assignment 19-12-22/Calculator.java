import java.util.Scanner;

public class Calculator{

public static int addition(int a, int b)
{
	int result = a+b;
	return result;
}
public static int substraction(int a, int b)
{
	int c;
	if(a>b)
	{
	c = a-b;
	}
	else
	{
	c = b-a;
	}
	return c;
}	
public static int multiplication(int a, int b)
{
	int result = a*b;
	return result;
}
public static float division(float a, float b)
{
	float result = a/b;
	return result;
}	
public static void main(String[] args)
{
	int choice, num1, num2, res;
	float num3, num4, res2;
	Scanner sc = new Scanner(System.in);
	System.out.println("which operation do you want to perform:");
	System.out.println("1)Addition\n 2)Substraction\n 3)Multiplication\n 4)Division");
	choice = sc.nextInt();
	switch(choice)
	{
		case 1:
			System.out.println("Enter first digit:");
			num1 = sc.nextInt();
			System.out.println("Enter second digit:");
			num2 = sc.nextInt();
			res = Calculator.addition(num1, num2);
			System.out.println(num1+" + "+num2+" = "+res);
			break;
		case 2:
			System.out.println("Enter first digit:");
			num1 = sc.nextInt();
			System.out.println("Enter second digit:");
			num2 = sc.nextInt();
			if(num2>num1)
			{
				
				res = Calculator.substraction(num1, num2);
				System.out.println(num2+" - "+num1+" = "+res);
			}
			else
			{
				res = Calculator.substraction(num1, num2);
				System.out.println(num1+" - "+num2+" = "+res);
			}
			break;
		case 3:
			System.out.println("Enter first digit:");
			num1 = sc.nextInt();
			System.out.println("Enter second digit:");
			num2 = sc.nextInt();
			res = Calculator.multiplication(num1, num2);
			System.out.println(num1+" * "+num2+" = "+res);
			break;
		case 4:
			System.out.println("Enter first digit:");
			num3 = sc.nextFloat();
			System.out.println("Enter second digit:");
			num4 = sc.nextFloat();
			res2 = Calculator.division(num3, num4);
			System.out.println(num3+" / "+num4+" = "+res2);
			break;
	}
}
}
