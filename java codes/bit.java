import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        int y = 32;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        check(y, i);
        s.close();
    }
    public static void check(int y, int i) {
        int mask = 1<<i;
        if((y & mask) > 0){
            System.out.println("True");
            return;
        }
        System.out.println("False");
    }

}
