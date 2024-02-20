class First
{
	First()
	{
		System.out.println("Odd And Even Number");

		for(int i=1;i<=25;i++)
		{
			if(i%2 == 0)
				System.out.println("Number Is Even : "+i);
			else
				System.out.println("Number Is Odd : "+i);
		}
	}
}

class Second extends First
{
	Second()
	{
		int a=15,i;
		System.out.println("Table is..");
		for(i=1;i<=10;i++)
		{
			System.out.println(a+"X"+i+"="+(a*i));
		}
	}
}

class Pro
{
	public static void main(String[] args) 
	{
		Second s = new Second();
	}
}