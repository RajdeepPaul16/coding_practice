import java.util.Scanner;

public class palindromeWithFunc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        palindrome(n);
        s.close();
    }
    public static void palindrome(int n) {
        int remainder = 0, reversed = 0, original = n;

        while(n!=0) {
            remainder = n%10;
            reversed = reversed*10 + remainder;
            n/=10;
        }
        if (original==reversed) {
            System.out.println(original + " is a palindrome number.");
        }
        else {
            System.out.println(original + " is not a palindrome number.");
        }
    }
}
