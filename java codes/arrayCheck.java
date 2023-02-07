import java.util.Scanner;

public class arrayCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int count = 0;
        int n  = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the elements: ");
            arr[i] = s.nextInt();
        }

        System.out.println("Enter the key element: ");
        int key = s.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                count += 1;
            }
        }

        System.out.println("The input array is: ");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("]");

        System.out.println("The key element is found " + count + " number of times in the given array.");
        s.close();
    }
}
