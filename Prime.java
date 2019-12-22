/*
write a program to print all the prime numbers at a given range by taking input from command line argument
*/

class Prime
{
	public static void main(String args[])
	{
		boolean status=false; 	//boolean is a variable type 
					//here the boolean variable status can show only two output
					//false or true. it is almost same like flag variable that we used to use in c
					// and assign the value as 0 or 1 to show it is false or true respectively
		int lowerbound=Integer.parseInt(args[0]);
					//since argument in args String array is taken as String to parse it into integer we use this syntax
		int upperbound=Integer.parseInt(args[1]);
		
		for(int i=lowerbound;i<upperbound;i++) 		 //for loop to run the loop from range lowerbound to upper bound
		{
			status= false;			 //i'll tell you why
			for(int j=2;j<=i/2;j++)  		 //for loop to check integer j is prime or not
			{
				if(i%j==0)
				{
					status=true;    	  //that is integer i is not prime 
					break;		//once it is composite it will break from the loop
				}
			}
			if(status==false)
				System.out.println(i+ "it is a prime no.....");
			else
				System.out.println(i+ "it is a composite number...");
		}//close of outer loop
	}//close of main method
}//close of class


