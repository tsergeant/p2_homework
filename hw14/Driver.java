/**
 * Driver for testing MyStack.
 *
 * @author
 * @version
 *
 */

public class Driver
{
	public static void main(String [] args)
	{
		MyStack s= new MyStack();

		s.push(10);
		s.push(20);
		s.push(15);
		s.push(25);
		s.push(12);

		while (!s.empty())
			System.out.println(s.pop());

	}
}

