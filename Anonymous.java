abstract class Vehicle
{
	abstract int Wheel();
}

class Anonymous
{
	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle()
		{
			int Wheel()
			{
				return 4;
			}
		};
		System.out.println(v.Wheel());

		Vehicle v1=new Vehicle()
		{
			int Wheel()
			{
				return 2;
			}
		};
		System.out.println(v1.Wheel());
	}
}