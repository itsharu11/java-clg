public class array
{
	public static void main(String args[])
	{
	int [][] n2 = {{1,2},{3,4}};
	int [] n = new int[10];
	n[0] = 9;
	n2 [0][1] = 99;
	System.out.println(n[0]);
	System.out.println(n[1]);
	System.out.println(n2[0][0]);
	System.out.println(n2[0][1]);
	System.out.println(n.length);

	}

}