package Do_While_loop;

public class Ex1 {
    public static void main(String[] args) {
        //  While -> int -> condition -> body -> increment / decrement
        // Do while  -> // int -> body -> condition -> incre / drement

        int a = 0;
        do{
            System.out.println("Print"+a);
            a++;
        }while (a<10);
    }
}
