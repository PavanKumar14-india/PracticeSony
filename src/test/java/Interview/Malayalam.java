package Interview;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Malayalam
{
	 
	 public static void main(String args[])
	{
		String s="malayalam";
		int count=0;
		for (int i = 0; i < s.length(); i++)
		{
			char c='a';
	
			if(s.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
