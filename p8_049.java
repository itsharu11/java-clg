class p8_049
{
	public static void main(String args[])
	{
		p8_049 p1 = new p8_049();
		p1.add(20,2);
		p1.sub(20,2);
		p1.mul(20,2);
		p1.div(20,2);
	}
	void add(int a,int b)
	{
		int c;
		c = a +b;
		System.out.println("Sum is : " +c);

	}
	void sub(int a,int b)
	{
		int c;
		c = a - b;
		System.out.println("Difference is : " +c);
	}
	void mul(int a,int b)
	{
		int c;
		c = a * b;
		System.out.println("Product is : " +c);
	}
	void div(int a,int b)
	{
		double c;
		c = a / b;
		System.out.println("Remainder is : " +c);
	}
}