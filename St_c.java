class First
{
	static class Second
	{
		Second()
		{
			System.out.println("Good Morning..");
		}
	}
}

class St_c
{
	public static void main(String[] args) 
	{
		First.Second fs = new First.Second();
	}
}