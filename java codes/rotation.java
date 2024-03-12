import java.util.Scanner;
import java.util.Arrays;

public class rotation {
    static boolean check(int key, int[] arr, int mid ){
        if(arr[mid]==key){
            return true;
        }
        return false;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = arr[0];
        Arrays.sort(arr);
        int ans = -1;
        int low = 0;
        int high = n-1;
        while(low <= high) {
            int mid = (low + high)/2;
            if(check(k, arr, mid)) {
                ans = mid;
            }
            else if(k > arr[mid]){
                low = mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
