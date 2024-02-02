class Calculator
{
	public static void main(String[] args) 
	{
		char n = '+';
		int a = 20;
		int b = 10;

		switch(n)
		{
		case '+':
			System.out.println("Addition :"+(a+b));
			break;
		case '-':
			System.out.println("Substraction :"+(a-b));
			break;
		case '*':
			System.out.println("Multiplication :"+(a*b));
			break;
		case '/':
			System.out.println("Division :"+(a/b));
			break;
		default:
			System.out.println("Select Only +,-,*,/");
			break;
		}

	}
}