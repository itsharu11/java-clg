interface a1
{
	final static int a1 = 0;
	void display_a1();
}
interface a2
{
	final static int a2 = 1;
	void display_a2();
}

interface a12 extends a1,a2
{
	final static int a12=3;
	void display_a12();
}
class p19_049 implements a12
{
	public void display_a1()
	{
	System.out.println("Value of a1 is "+a1);
	}
	public void display_a2()
	{
	System.out.println("Value of a2 is "+ a2);
	}
	public void display_a12()
	{
		System.out.println("value of a12 is "+a12);
	}
	public static void main(String args[])
	{
		b ao = new b();
		ao.display_a1();
		ao.display_a2();
		ao.display_a12();
	}
}