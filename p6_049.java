// A program to find the second maximum number out of three using conditional operator
class p6_049
{
	public static void main(String args[])
	{
		int a = 1,b = 2, c = 3,x,y,z;
		x = a>b?a:b;
		y = x>c?x:c;
		z = y>x?x:y;
		System.out.println("Max : "+y);
		System.out.println("Second Max : "+z);

	}
}