//Ternary Operators to handle multiple conditions.
// Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C

package Task;

public class Ternary_Operator_20_Sep_B {
    public static void main(String[] args) {
        int score = 85;


        String grade = (score >= 90) ? "A" :
                (score >= 80) ? "B" :
                        (score >= 70) ? "C" : "F";

        System.out.println("The grade is: " + grade);
    }
}
