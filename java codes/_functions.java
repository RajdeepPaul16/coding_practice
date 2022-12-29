import java.util.function.Function;

public class _functions {
    public static void main(String[] args) {
        System.out.println("4 under plusOneFunction = " + plusOneFunction.apply(4));
        System.out.println("4 under multipy5Function = " + multipy5Function.apply(4));
        System.out.println("4 under andThen = " + andThen.apply(4));
    }
    static Function<Integer, Integer> plusOneFunction = num -> num + 1;
    static Function<Integer, Integer> multipy5Function = nom -> nom * 5;
    static Function<Integer, Integer> andThen = plusOneFunction.andThen(multipy5Function);
}
