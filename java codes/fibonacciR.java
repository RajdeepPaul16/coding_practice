public class fibonacciR {
    public static void main(String[] args) {
        int result = fib(5);
        System.out.print(result);
    }
    public static int fib(int x) {
        if (x == 1 || x == 2) {
            return 1;
        }
        else {
            return fib(x - 1) + fib(x - 2);
        }
    }
}