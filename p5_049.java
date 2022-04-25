class p5_049
{
	public static void main(String args[])
	{
		int a,b,c;
		int max;
		a = 10;
		b = 20;
		c = 30;
		max = a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("Maximum number is : " + max);
	}
}