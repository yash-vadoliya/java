// static Level  synchronized

// syntax:
// public static synchronized method_name()
// {
// 	......
// }
// public void run()
// {

// }

class Salary extends Thread
{
	public static synchronized void With()
	{
		String e_nm = Thread.currentThread().getName();
		try
		{
			System.out.println("Employee name : " +e_nm + " 50000/-");
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	}
	@Override
	public void run()
	{
		With();
	}
}

class Static_s
{
	public static void main(String[] args) 
	{
		Salary s1 = new Salary();
		Salary s2 = new Salary();
		Salary s3 = new Salary();

		s1.setName("Rahul");
		s2.setName("Jay");
		s3.setName("Ram");

		s1.start();
		s2.start();
		s3.start();
	}
}