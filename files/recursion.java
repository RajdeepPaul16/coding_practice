public class recursion {
    public static void main(String[] args) {
        int result = num(5, 10);
        System.out.println(result);
    }

    public static int num(int x, int y ) {
        if ( y > x ) {
            return y + num(x, y - 1);
        }
        else {
            return x;
        }
    }
}
