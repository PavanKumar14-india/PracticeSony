package Interview;

import org.testng.annotations.Test;

public class Divisibility
{
	@Test
	public void test1()
	{
		int[] arra2;
		int[] arra3;
		int[] arra32;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			 
		}
		for(int i=1;i<=20;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
			 
		}
		for(int i=1;i<=20;i++)
		{
			if((i%2==0)&&(i%3==0))
			{
				System.out.println(i);
			}
			 
		}
	}

}
