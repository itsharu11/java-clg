class shapeArea
{
	void area(int l,int b)
	{
		int a = l * b;
		System.out.println("The area of Rectangle is : "+ a)
	}

	void area(int l)
	{
		int a = l * l;
		System.out.println("the area of square is : "+ a)

	}

	void area(double r)
	{
		int a = 3.14*r*r;
		System.out.println("The area of circle is : "+ a);

	}
}

class methodOver
{
	public static void main(String args[])
	{
		area(2,2);
		area(2);
		area(2);
	}
}
