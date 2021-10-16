import java.util.*;
public class Evenorodd1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		if (num%2==0)
		System.out.println("Print Even");
		else
		System.out.println("Print Odd");
	}
}
