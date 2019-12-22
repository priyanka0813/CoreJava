//program to implement method overloading using buffered reader
//program to calculate volume of a cube and volume of a cylinder
import java.io.*;

class Volume
{
	double volume(double a)
	{
		return(a*a*a);
	}
	double volume(double a,double b)
	{
		return(3.14*a*a*b);
	}
}

class TestVolume
{
public static void main(String args[])throws IOException
{
	Volume obj=new Volume();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the side of the cube");
	double side;
	side=Double.parseDouble(br.readLine());
	System.out.println("the volume of the cuboid is"+obj.volume(side));
	System.out.println("enter the radius and height of th cylinder");
	double radius,height;
	radius=Double.parseDouble(br.readLine());
	height=Double.parseDouble(br.readLine());
	System.out.println("the volume of the cylinder is"+obj.volume(radius,height));
}
}
	
