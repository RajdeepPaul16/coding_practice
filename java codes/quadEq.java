import java.util.*;

public class quadEq { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble();
        double fr,sr;
        double det = b*b-4*a*c;
        if (det>0) {
            fr = (-b + Math.sqrt(det))/(2*a);
            sr = (-b - Math.sqrt(det))/(2*a);
            System.out.format("First root: %2f, second root: %2f",fr,sr);
        }
        else if (det==0) {
            fr = sr = (-b)/(2*a);
            System.out.format("First root = second root: %2f",fr);
        }
        else {
            double r = (-b)/(2*a);
            double i = (Math.sqrt(det))/(2*a);
            System.out.format("First root: %0.2f+%0.2fi",r,i);
            System.out.format("Second root: %0.2f-%0.2fi",r,i);
        }
        sc.close();
        
    }
    
}
