/**
 * Demonstrates use of Java's ArrayList.
 *
 * @author  TSergeant
 * @version for Program Design 2
 */

import java.util.ArrayList;

public class DemoArrayList
{
	public static void main(String [] args)
	{
		ArrayList<String> al;

		al= new ArrayList<String>();

		al.add("hi");
		al.add("there");
		System.out.println(al.size());
		System.out.println(al.get(0));
		System.out.println(al.get(1));
	}
}
