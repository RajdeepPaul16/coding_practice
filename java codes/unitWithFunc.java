import java.util.Scanner;

public class unitWithFunc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        unit(n);
        s.close();
    }
    public static void unit(int n) {
        int x = n%10;
        System.out.println("The unit digit is " + x);
    }
}
