//program to implement variable array in java 

class Pattern2
{
	public static void main(String args[])
	{
		int n=3;
		int array[][]=new int[4][];
		int array1[][]=new int[4][];
		//allocating size of the coloumns
		for(int i=0;i<4;i++)
		{
			array[i]=new int[i+1];
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				array[i][j]=n;
				
			}
			n=n+1;
		//System.out.println("\n");
		}
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(array[i][j]);
			}
		System.out.print("\n");
		}
		
		
	}
}