public class factorialR {
    public static void main(String[] args) {
        int result = fac(5);
        System.out.println(result);
    }

    public static int fac(int x) {
        if (x > 1) {
            return x * fac(x - 1);
        }
        else {
            return 1;
        }
    }
}
