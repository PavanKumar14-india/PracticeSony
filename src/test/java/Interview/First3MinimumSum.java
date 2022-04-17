package Interview;

import org.testng.annotations.Test;

public class First3MinimumSum
{
	@Test
	public void test()
	{
		int[] a={7, -6, 11, 9, 0, 4};
		int sum=0;
		for(int i=0;i<a.length;i++)	
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);	
		}
		
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i]; 
			}
		System.out.println(sum);
	}

}
