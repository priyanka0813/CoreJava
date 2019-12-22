//program to implement command line argument

import java.io.*;
import java.util.*;

class Fibonacci
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int array[]=new int[10];
		array[0]=1;
		array[1]=1;
		for(int i=2;i<n;i++)
		{
			array[i]=array[i-1]+array[i-2];
		}
		System.out.println("the resultant fibonacci series is \n");
		for(int i=0;i<n;i++)
		{
		System.out.println(array[i]);
		}
	}
}