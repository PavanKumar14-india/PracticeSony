package Interview;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class CharacterCount 
{
	@Test
	public void Charactercount()
	{
		String s="pavankmarsc";
		LinkedHashSet<Character> lt=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			lt.add(s.charAt(i));
		}
		
		for (Character ch:lt)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
		 
	}	 

}
