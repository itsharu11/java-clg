public class datatype_demo
{
	public static void main(String args[])
	{
		System.out.println( (int)3.14);
		System.out.println( (double)3);

		int intFromString = Integer.parseInt("50");
		double doubleFromString = Double.parseDouble("50.99");

		System.out.println(100 + intFromString);
		System.out.println(100 + doubleFromString);
			
	}
}