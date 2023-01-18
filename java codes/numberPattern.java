import java.util.Scanner;

public class numberPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to create: ");
        int n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i-1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println(" ");
        }
        s.close();
    }
}
