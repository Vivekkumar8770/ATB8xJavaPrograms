// Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or
// scalene (no sides are equal).
// Use an if-else statement to classify the triangle.
// side1, side2, side3 ->
package Task;

import java.util.Scanner;

public class Triangle_Clasifiers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side1 : ");
        int side1 = sc.nextInt();

        System.out.print("Enter first side2 : ");
        int side2 = sc.nextInt();

        System.out.print("Enter first side3 : ");
        int side3 = sc.nextInt();
        if (side1 >= 1 && side2 >= 1 && side3 >= 1) {
            // if the triangle is equilateral (all sides are equal),
            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("equilateral");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("isosceles");
            } else  {
                System.out.println("scalene");
            }
        }
        else {
            System.out.println("Please enter positive number");
        }
    }

}
