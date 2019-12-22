//Fibonacci without using for loop

import java.io.*;
class FibonacciWhile
{
	public static void main(String args[])
	{
		int next,first=1,second=1;
		int n=Integer.parseInt(args[0]);
		System.out.println(first+"\n"+ second);
		while(n-2>0)
		{
		next=first+second;
		first=second;
		second=next;
		System.out.println(next);
		n--;
		}
	}
}