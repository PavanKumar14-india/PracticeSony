package Interview;

import org.testng.annotations.Test;

public class Prime 
{
	@Test
	public void test()
	{
		boolean flag=false;
	
		for(int i=2;i<=100;i++)
		{
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println(i+" is  a prime");
			}
			 
			flag=false;
		}
	}

}
