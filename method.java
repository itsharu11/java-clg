import java.util.Scanner;
public class method
{
	public static void main(String args[])
	{
		Scanner ip = new Scanner(System.in);
		int sum,n1,n2;
		n1 = ip.nextInt();
		n2 = ip.nextInt();
		sum = add(n1,n2);
		System.out.println(sum);

	}
	public static int add(int n1,int n2)
	{
			int sum;
			sum = n1 + n2;
			return sum;
	}
}
