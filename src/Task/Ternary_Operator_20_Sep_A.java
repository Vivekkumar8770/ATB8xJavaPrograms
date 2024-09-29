//By using Ternary Operators max between 3 numbers.
// Input int - a,b,c - a = 10, b = 20, c = 45
// Max → a,b,c → c
package Task;

public class Ternary_Operator_20_Sep_A {
    public static void main(String[] args) {

        int a = 10;
        int b= 20;
        int c = 45;

        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

        System.out.println("The maximum number is: " + max);

    }
}
