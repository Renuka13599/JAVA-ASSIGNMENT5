import java.util.*;
public class Harmonic
{
public static void main(String[] args)
    {
        System.out.print("Enter any number : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("The Harmonic Series is : ");
        double result = 0.0;
        while(num > 0)
          {
               result = result + (double) 1 / num;
               num--;
               System.out.println(result +"  ");
          }
        System.out.println("Output of Harmonic Series is "+result);
    }
}
