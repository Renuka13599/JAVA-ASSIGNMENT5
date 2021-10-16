import java.util.Scanner;

public class FlipCoin
{
	public static void main(String[] args) 
	{

		int choice;
		CoinToss test = new CoinToss();
		System.out.println("Welcome to the coin flip game!");

		do
		{
			System.out.println("Enter '1' to Flip Coin OR Enter '0' to Quit: ");
			Scanner u=new Scanner(System.in);
			choice = u.inputInteger();

			if (choice == 1)
			{
				test.flip();
			}
			else if (choice > 1)
			{
				System.out.println("Invalid entry - please enter 1 or 0: ");
				choice = u.inputInteger();
			}
		}
	while (choice != 0);
	}
}
