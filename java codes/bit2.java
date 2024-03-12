public class bit2 {
    public static void main(String[] args) {
        int y = 76;
        int count = 0;
        for(int i = 0; i<32; i++) {
            if((y&(1<<i)) > 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
