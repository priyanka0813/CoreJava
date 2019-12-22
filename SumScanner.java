//method area ->stores class code, code of the methods and variables
//heap area->java objects are created in this area
//java stack-> while running the methods the results are stored in the stack memory
//Program Counter register-> this contain the address of the istruction of the methods
//native method stack-> similar to java stack the native methods are executed on the native method stack


//program to implement scanner

import java.io.*;
import java.util.*;

class Sum
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the two numbers \n");
		int n1=obj.nextInt();
		int n2=obj.nextInt();
		System.out.println("the sum of two numbers is "+(n1+n2));
	}
}