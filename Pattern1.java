//program to implement variable array in java 

class Pattern1
{
	public static void main(String args[])
	{
		char array[][]=new char[5][];
		//allocating size of the coloumns
		for(int i=0;i<5;i++)
		{
			array[i]=new char[i+1];
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				array[i][j]='*';
			}
		//System.out.println("\n");
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(array[i][j]);
			}
		System.out.print("\n");
		}
	}
}