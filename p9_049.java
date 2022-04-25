class p9_049
{
	public static void main(String args[])
	{
		int num = 123;
		int rev = 0 , dig;
		System.out.println("Num =" + num);
		while(num!=0)
		{
			dig = num % 10;
			rev = rev * 10 + dig;
			num = num / 10;
		}
		System.out.println("Reversed num : " + rev);
	}
}