// Static Nested Class
// Syntax:
// 	class class_name
// 	{
// 		static class class_name
// 		{
// 			---
// 			---
// 		}
// 	}

class Student
{
	static class Mca
	{
		void sem()
		{
			System.out.println("Sem Two...");
		}
	}
}

class St_nes
{
	public static void main(String[] args) 
	{
		Student.Mca sm = new Student.Mca();
		sm.sem();
	}
}