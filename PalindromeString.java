//java program to check whether the string in palindrome or not
//taking input from the command line argument


import java.io.*;
class PalindromeString
{
	public static void main(String args[])
	{
		char array[]=args[0].toCharArray();
		int n,flag=0;
		n=args[0].length();
		for(int i=0;i<n;i++)
		{
			if(array[i]==(array[n-1-i]))
			continue;
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("the string is a palindrom string");
		else
		System.out.println("not a palindrome \n");
	}
}
		