class p09_049
{
	public static void main(String args[])
	{
		int a [][] = new int [3] [3];
		a[0][0] = 1;
		a[0][1] = 1;
		a[0][2] = 1;
		a[1][0] = 1;
		a[1][1] = 1;
		a[1][2] = 1;
		a[2][0] = 1;
		a[2][1] = 1;
		a[2][2] = 1;
		int b [][] = new int [3] [3];
		b[0][0] = 1;
		b[0][1] = 1;
		b[0][2] = 1;
		b[1][0] = 1;
		b[1][1] = 1;
		b[1][2] = 1;
		b[2][0] = 1;
		b[2][1] = 1;
		b[2][2] = 1;

		int c [][] = new int [3] [3];
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;

				for(int k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("c"+"["+i+"]"+"["+j+"]"+" = "+c[i][j]);

			}
		}

	}
}