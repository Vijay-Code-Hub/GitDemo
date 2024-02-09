package demo1;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class demo1 {
	/* Occurrence of char in string
	 * duplicate char in string 
	 * Reverse each word 
	 * Reverse each char of string 
	 * Extract first char of string 
	 * 
    
		 * 
		 * */
	public static void main(String []args)

	{
		String s="Vijay Pratap Sharma";
		String a[]=s.split(" ");
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<1;j++)
			{
				char ch=a[i].charAt(j);
				System.out.print(ch+".");
			}
		}
		System.out.println(a[n-1]);
	}

}
