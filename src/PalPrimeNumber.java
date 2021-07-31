import java.io.*;
import java.util.*;
class PalPrimeNumber
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //declare and initialize variables
        int number, temp, rem, i;
        int count = 0;
        int sum = 0;

        System.out.println("Enter number to check");

        number = sc.nextInt();


        temp = number;

        //use for loop check whether number is prime or not
        for(i = 1; i <= temp; i++)
        {
            if(temp%i == 0)
            {
                count++;    //increment counter when the reminder is 0
            }
        }

        //use while loop to check whether the number is palindrome or not
        while(number > 0)
        {
            // get last digit of the number
            rem = number%10;

            // store the digit last digit
            sum = sum*10+rem;

            // extract all digit except the last6

            number = number/10;
        }

        //check whether the number is palindrome and Prime or not
        if(temp == sum && count == 2)
        {
            System.out.println(temp +" is a PalPrime number");
        }
        else
        {
            System.out.println(temp +" is not a PalPrime number");
        }
    }
}