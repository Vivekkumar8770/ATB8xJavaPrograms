//Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz"
// instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5,
// print "FizzBuzz."
package Task;

import java.util.Scanner;

public class Fizzbuzz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        for (int i=1 ; i<=num ; i++)
        {
            if (i%3 ==0 && i%5==0)
            {
                System.out.println(i + " is FizzBuzz");
            }
            else if (i%3 ==0)
            {
                System.out.println(i + " is Fizz");
            }
            else if (i%5 ==0)
            {
                System.out.println(i + " is Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }

    }

}
