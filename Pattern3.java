//second array
import java.io.*;

class Pattern3
{
	public static void main(String args[])
	{
		int array[][]=new int[4][];
		int coloumn=4;
		int n=6;
		for(int i=0;i<4;i++)
		{
			array[i]=new int[coloumn];
			coloumn=coloumn-1;
		}
		int c=4;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<c;j++)
			{
				array[i][j]=n;
				
				
			}
			c--;
			n=n-1;
		//System.out.println("\n");
		}
		c=4;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(array[i][j]);
			}
			c--;
		System.out.print("\n");
		}
	}
}
