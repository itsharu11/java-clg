import java.util.ArrayList;
public class array_list
{
	public static void main(String args[])
	{
		ArrayList<String> fr = new ArrayList<String>();
		fr.add("oscar");
		fr.add("Angela");
		fr.add("Kevin");

		fr.remove("oscar");
		System.out.println(fr.toString());
		System.out.println(fr.get(0));
		System.out.println(fr.contains("oscar"));
		System.out.println(fr.size());



	}
}