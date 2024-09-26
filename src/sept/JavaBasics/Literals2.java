package sept.JavaBasics;

public class Literals2
{
    public static void main(String[] args) {
        // ✅ Literals
        // Boolean
        // Integral

        // Char
        //  Single Char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char car_r = '\r';

        System.out.println("Vivek"+ new_line +  "Kumar");
        // System.out.println("Pramod"+ '\n' +  "Kumar");
        System.out.println("Vivek"+ tab_line +  "Kumar");
        System.out.println("Vivek"+ back_space +  "Kumar");
        System.out.println("Vivek"+ car_r +  "Kumar");

        char c11  = '\u1F60'; //65 - ASCII
        // chinese - india, japense -> unicode
        // /u09878

        System.out.println(c11); // ὠ - :)


    }
}
