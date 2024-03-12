import java.util.Scanner;

public class contest1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for(int j = 0; j < n; j++){
            int nb = sc.nextInt();
            int arr1[] = new int[nb];
            int arr2[] = new int[nb];
            int r1 = 0, r2 = 0, r3 = 0;
            for(int i = 0; i <nb; i++){
                arr1[i] = sc.nextInt();
                if(arr1[i] == 1){
                    r1 += 1;
                }
                else {
                    r2 += 1;
                }
            }
            for(int i = 0; i <nb; i++){
                arr2[i] = sc.nextInt();
                if(arr1[i] == 1){
                    r3 += 1;
                }
            }
            if(r1 > r3){
                ans = r1;
            }
            else if(r1 < r3){
                ans = r2;
            }
            else {
                ans = r1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
