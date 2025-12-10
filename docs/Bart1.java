/**
 * Bart Simpson program (that works).
 *
 * @author  Terry Sergeant
 * @version for Program Design and Development II
 *
*/

import java.util.Scanner;

public class Bart1
{
	public static void main(String [] args)
	{
		Scanner kb= new Scanner(System.in);
		String msg;
		int    n,i;

		System.out.print("Enter message: ");
		msg= kb.nextLine();

		System.out.print("Enter how many times to display message: ");
		n= kb.nextInt();

		i= 0;
		while (i < n) {
			System.out.println(msg);
			i= i+1;
		}
	}
}
