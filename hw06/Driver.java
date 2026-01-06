import java.util.Scanner;

public class Driver
{
	public static void main(String [] args)
	{
		ComputerRPSPlayer a,b;
		a= new ComputerRPSPlayer("George");
		b= new ComputerRPSPlayer("Mary");

		System.out.println("0 is the code for "+ComputerRPSPlayer.translate(0));
		System.out.println("1 is the code for "+ComputerRPSPlayer.translate(1));
		System.out.println("2 is the code for "+ComputerRPSPlayer.translate(2));
		System.out.println("3 is the code for "+ComputerRPSPlayer.translate(3));
		System.out.println("---------------------------------");

		a.fight(b);
	}
}

