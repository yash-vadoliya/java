// class Var
// {
// 	int no;
// }

// class Access
// {
// 	public static void main(String[] args) {
// 		Var v = new Var();
// 		v.no = 5;
// 		System.out.println("Square is :"+(v.no*v.no));
// 	}
// }

class Var
{
	int no;
	int one()
	{
		int a=100;
		return a;
	}
}
class Access
{
	public static void main(String[] args) 
	{
		Var v = new Var();
		System.out.println(v.one());	
	}
}