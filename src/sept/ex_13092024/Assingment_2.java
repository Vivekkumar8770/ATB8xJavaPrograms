/*Prepare a small calculator, which supports +, - , , / and %(?) - Modulus operator
double a = 34;
double b = 10;
Print - a+b, a-b, ab, a/b, a%b all the outputs.
 */
package sept.ex_13092024;

import java.util.Scanner;

public class Assingment_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double number1 = scanner.nextInt();

        System.out.print("Enter second number : ");
        double number2 = scanner.nextInt();

        System.out.println("Addition of "+number1+" and " +number2+ " = " +  (number1+number2));
        System.out.println("Subtraction of "+number1+" and " +number2+ " = " +  (number1-number2));
        System.out.println("Multiflication of "+number1+" and " +number2+ " = " +  (number1*number2));
        System.out.println("Division of "+number1+" and " +number2+ " = " +  (number1/number2));
        System.out.println("Modulous of "+number1+" and " +number2+ " = " +  (number1%number2));

    }
}
