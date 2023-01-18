import java.util.Scanner;

public class deletingElement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }

        System.out.println("The array before deletion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]  + " ");
        }
        System.out.println(" ");
        
        System.out.print("Enter the no. you want to delete from the array: ");
        int index = s.nextInt();

        int anotherarr[] = new int[99];
        for (int i = 0, k = 0; i < 100; i++) {
            if (i == index - 1) {
                continue;
            }
            anotherarr[k++] = arr[i];
        }

        System.out.println("The array after deletion: ");
        for (int i = 0; i < anotherarr.length; i++) {
            System.out.print(anotherarr[i]  + " ");
        }

        s.close();
    }
}
