package For_Loop;

public class Ex10 {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) { // 0 to 9
            System.out.println(i);
            if(i == 5){
                continue;
            }
            System.out.println("After");
        }
    }
}
