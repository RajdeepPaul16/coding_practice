import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Array after sorting:");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i] + " ");
        }
        sc.close();
    }
}
