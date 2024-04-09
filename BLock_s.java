// // Block level Sybcronize

// Syntax : 
// public void run()
// {
// 	synchronized(this)
// 	{
// 		.......
// 	}
// }

class Movie extends Thread
{
	int ticket=1,person;
	Movie(int person)
	{
		this.person = person;
	}

	public void run()
	{
		String m_nm = Thread.currentThread().getName();
		synchronized(this)
		{
			if(ticket>=person)
			{
				System.out.println("Ticket Booked => "+m_nm);
				ticket = ticket - person;
			}
			else
			{
				System.out.println("Housefull show..");
			}
		}
	}
}

class Block_s
{
	public static void main(String[] args) 
	{
		Movie m = new Movie(1);

		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);

		t1.setName("3 Iditos");
		t2.setName("salar");
		t3.setName("Kung fu panda 4");

		t2.start();
		try
		{
			t2.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		t1.start();
		t3.start();
	}
}