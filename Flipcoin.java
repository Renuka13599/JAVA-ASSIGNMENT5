import java.util.Scanner;

public class FlipCoin
{
	public static void main(String[] args) 
	{

		int choice;
		System.out.println("Welcome to the coin flip game!");

		do
		{
			System.out.println("Enter '1' to Flip Coin OR Enter '0' to Quit: ");
			Scanner u=new Scanner(System.in);
			choice = u.nextInt();

			if (choice == 1)
			{
				System.out.println("Flip cion");
			}
			else if (choice > 1)
			{
				System.out.println("Invalid entry : ");
				choice = u.nextInt();
			}
		}
	while (choice != 0);
	}
}
