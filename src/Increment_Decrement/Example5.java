package Increment_Decrement;

public class Example5 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A -> a++ -> 10 , a= 11
        // + -> operator
        // B -> ++a  -> a= 12 exp -> 12

        // Line no | a  |  Exp
        // 5   | 10 | NA
        // 6  | 12 | 10 + 12

    }
}
