import java.io.*;

class Employee
{
	String Name;
	double DA,HRA;
	
	 Employee(String a,double b,double c)
	{
		
		this.Name=a;
		this.DA=b;
		this.HRA=c;
		//System.out.println("this is Employee constructor");
	}

	double salaryCalculation(double basicPay)
	{
		double totalSalary=(basicPay+(DA*basicPay)+(HRA*basicPay));
		return totalSalary;
	}
	
}

class Teacher
{
	String designation;
	 Teacher(String a,double b,double c,String d)
	{
		super(a,b,c);
		this.designation=d;
		System.out.println("this is Teacher constructor");

	}
}

class Faculty
{
	public Faculty(String a,double b,double c,String d)
	{
		super(a,b,c,d);
		System.out.println("this is Faculty  constructor");
	}
}

class MultilevelInheritance
{
	public static void main(String args[])throws IOException
	{
		String a,d;
		double b,c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name,DA,HRA and designation of the faculty");
		a=br.readLine;
		b=Double.parseDouble(br.readLine);
		c=Double.parseDouble(br.readLine);
		d=br.readLine;
		Faculty obj=new Faculty(a,b,c,d);
		System.out.println("the name DA, Hra and the designation of this faculty is "+obj.Name+obj.DA+obj.HRA+obj.designation);
		
		double basicPay;
		System.out.println("the total salary of the faculty is "+salaryCalculation(basicPay));
	}
}
	