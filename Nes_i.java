// // Nested interface
// class class_name --outer class
// {
// 	interface interface_name --inner class
// 	{
// 		void msg();
// 	}
// }
// class class_name implements class_name.interface_name
// {

// }

class First
{
	interface Second
	{
		void msg();
	}
}
class Third implements First.Second
{
	public void msg()
	{
		System.out.println("Hii, Yash Vadoliya");
	}
}
class Nes_i
{
	public static void main(String[] args) 
	{
		First.Second fs = new Third();
		fs.msg();
	}
}