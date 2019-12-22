//add sub and mul of complex numbers using
//default parameterized and by passing object constructor

import java.lang.*;
class Complex
{
int real,imag;

//default constructor

public Complex()
{
	real=2;
	imag=3;
}

//parameterized constructor

public Complex(int a,int b)
{
	this.real=a;
	this.imag=b;
}

public Complex(Complex obj)
{
	this.real=real.obj;
	this.imag=imag.obj;
}

//methods

public Complex add(Complex obj1, Complex obj2)
{
	Complex obj3;
	obj3.real=obj1.real+obj2.real;
	
	obj3.imag=obj1.imag+obj2.imag;
	return obj3;
}
public Complex sub(Complex obj1, Complex obj2)
{
	Complex obj3;
	obj3.real=obj1.real-obj2.real;
	
	obj3.imag=obj1.imag-obj2.imag;
	return obj3;
}

public Complex mul(Complex obj1, Complex obj2)
{
	Complex obj3;
	obj3.real=(obj1.real*obj2.real)-(obj1.imag*obj2.imag);
	
	obj3.imag=(obj1.imag*obj2.real)+(obj2.imag*obj1.real);
	return obj3;
}
}

class Complex1
{
	publlic static void main(string args[])
	{
		Complex ob=new Complex();
		
		System.out.println("addition using default constructor is ");
		Complex obja=new Complex();
		Complex objb=new Complex();
		
		ob=obj.add(obja,objb);