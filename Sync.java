class Bus extends Thread
{
	int seat=1,passengeer;
	Bus(int passengeer)
	{
		this.passengeer = passengeer;
	}

	@Override
	public synchronized void run()
	{
		String nm = Thread.currentThread().getName();
		if(seat>=passengeer)
		{
			System.out.println(nm+" Your ticket booked..");
			seat = seat-passengeer;
		}
		else
		{
			System.out.println("Sorry Ticket is not Avilable .."+nm);
		}
	}
}

class Sync
{
	public static void main(String[] args) 
	{
		Bus b = new Bus(1);

		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(b);

		t1.setName("Rahul");
		t2.setName("Jay");
		t3.setName("Dhaval");

		t1.start();
		t2.start();
		t3.start();
	}
}