import java.util.Scanner;

public class contest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int area = 0;
        int[][] data = new int[4][2];

        for(int j = 0; j < n; j++) {
            for(int i = 0; i < 4; i++) {
                data[i][0] = sc.nextInt();
                data[i][1] = sc.nextInt();
            }
            int ans1 = Math.abs(data[0][0]-data[1][0]);
            int ans2 = Math.abs(data[0][1]-data[1][1]);
            if(ans1 != 0){
                area = ans1*ans1;
            }
            else {
                area = ans2*ans2;
            }
            System.out.println(area);
        }
        sc.close();
    }
}
