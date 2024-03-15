package pack;
import pack.*;

public class Sal
{
	public Sal()
	{
		U_input u = new U_input();
		int nat_sal,ta,da,tex,sal1;

		int sal = u.sal;

		if(sal < 10000)
		{
			ta = sal*5/100;
			da = sal*2/100;
			nat_sal = sal + da + ta;
			System.out.println("----------------------------------");
			System.out.println("TA = "+ta);
			System.out.println("DA = "+da);
			System.out.println("NET SALARY = "+nat_sal);
		}

		else if(sal >= 10000 && sal <= 30000)
		{
			tex = sal*2/100;
			sal1 = sal - tex;
			ta = sal*5/100;
			da = sal*2/100;
			nat_sal = sal + da + ta;
			System.out.println("----------------------------------");
			System.out.println("SAL = "+sal1);
			System.out.println("TA = "+ta);
			System.out.println("DA = "+da);
			System.out.println("NET SALARY = "+nat_sal);
		}

		else if(sal >= 30000 && sal <= 50000)
		{
			tex = sal*4/100;
			sal1 = sal - tex;
			ta = sal*5/100;
			da = sal*2/100;
			nat_sal = sal + da + ta;
			System.out.println("----------------------------------");
			System.out.println("SAL = "+sal1);
			System.out.println("TA = "+ta);
			System.out.println("DA = "+da);
			System.out.println("NET SALARY = "+nat_sal);
		}

		else if(sal >= 50000)
		{
			tex = sal*6/100;
			sal1 = sal - tex;
			ta = sal*5/100;
			da = sal*2/100;
			nat_sal = sal + da + ta;
			System.out.println("----------------------------------");
			System.out.println("SAL = "+sal1);
			System.out.println("TA = "+ta);
			System.out.println("DA = "+da);
			System.out.println("NET SALARY = "+nat_sal);
		}
	}
}