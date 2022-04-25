interface A
{
	void show();
}

interface B
{
	void print();
}

class p024_049 implements A,B
{
	public void show()
	{
		System.out.println("Implementing method of class A");
	}
	public void print()
	{
		System.out.println("Implementing method of class B");
	}
	public static void main(String args[])
	{
		p024_049 c1 = new p024_049();
		c1.show();
		c1.print();
	}
}