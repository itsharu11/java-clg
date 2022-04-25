interface p
{
	final int p=0;
	public void fp();
}
interface p1 extends p
{
	final int p1=1;
	public void fp1();
}
interface p2 extends p
{
	final int p2=2;
	public void fp2();
}
interface p12 extends p1,p2
{
	final int p12=12;
	public void fp12();
}
class q implements p12
{
	public void fp()
	{
	System.out.println("Interface P");
	}
	public void fp1()
	{
	System.out.println("Interface P1");
	}
	public void fp2()
	{
	System.out.println("Interface P2");
	}
	public void fp12()
	{
	System.out.println("Interface P12");
	}
}
class p023_049
{
	public static void main(String args[])
	{
	q obj=new q();
	obj.fp();
	obj.fp1();
	obj.fp2();
	obj.fp12();
	}
}