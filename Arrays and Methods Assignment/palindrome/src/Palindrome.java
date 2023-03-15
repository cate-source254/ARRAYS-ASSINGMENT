
import java.util.Scanner;
public class Palindrome {
    public static void main(String args[])
    {

        {
            //Take input from the user
            //Create instance of the Scanner class
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number: ");
            String reverse = "";
            String num = input.nextLine();
            int length = num.length();
            for ( int i = length - 1; i >= 0; i-- )
                reverse = reverse + num.charAt(i);
            if (num.equals(reverse))
                System.out.println("The Number " +num +" is a palindrome.");
            else
                System.out.println("The Number " +num +"  isn't a palindrome.");
        }
    }



}


