//Write a program to print the table of number which user will give( int num 10)
//output will be like this (by using the printf()
//10 × 1 = 10
//10 × 2 = 20
//10 × 3 = 30….
//10 × 10 = 100.
package sept.ex_13092024;
import java.util.Scanner;
public class Assingment__1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        System.out.printf("%d × %d = %d%n", number, 1, number * 1);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 2, number * 2);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 3, number * 3);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 4, number * 4);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 5, number * 5);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 6, number * 6);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 7, number * 7);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 8, number * 8);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 9, number * 9);
        System.out.println();
        System.out.printf("%d × %d = %d%n", number, 10, number * 10);
        System.out.println();



    }
}
