class p4_049
{
	public static void main(String args[])
	{
		int i,j,count,limit;
		limit=100;
		System.out.println("Prime numbers from 1 to 100 are : ");
		for(i=2;i<=limit;i++)
		{
			count = 0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count == 2)
			{
			System.out.println(i);
			}
		}
	}
}
