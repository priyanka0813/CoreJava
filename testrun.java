import java.io.*;

import java.lang.*;

class Complex{
int real,imag;
public Complex()
{
real=2;
imag=3;
}

public Complex(int a,int b)
{
this.real=a;
this.real=b;
}

public Complex(Complex obj)
{
this.real=obj.real;
this.imag=obj.imag;
}

Complex add(Complex obj1,Complex obj2)
{
Complex obj3=new Complex();
obj3.real=obj1.real+obj2.real;
obj3.imag=obj1.imag+obj2.imag;
return obj3;
}

}

class Complex1
{
public static void  main(String args[])
{
	Complex ob=new Complex();
	Complex obja=new Complex();
	Complex objb=new Complex();
	ob=ob.add(obja,objb);
	System.out.println("the addition is "+ob.real+"+ i"+ob.imag);
}
}