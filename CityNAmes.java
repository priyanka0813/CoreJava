//program to sort the city names in alphabatic order

import java.io.*;

class CityNames
{
	public static void main(String args[])
	{
		String array[]={"Kolkata","Manipur","Jaipur"}; //an array of strings
		String temp;
		//we sort it in alphabatic order
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j].compareTo(array[j+1])>0)
				{
				temp=array[j+1];
				array[j+1]=array[j];
				array[j]=temp;
				}
			}
		}

		System.out.println("the city names in alphabatic order are \n");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}
}
		
			