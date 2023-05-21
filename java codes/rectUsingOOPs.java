import java.util.Scanner;

public class rectUsingOOPs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of students: ");
        int n = s.nextInt();
        Student[] h = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the id: ");
            int id = s.nextInt();
            System.out.print("Enter the name: ");
            String name = s.next();
            h[i] = new Student();
            h[i].insert(id, name);
        }
        for (int i = 0; i < n; i++) {
            h[i].display();
        }
        s.close();
    }
}
class Student{
    int id;
    String name;
    void insert(int i, String n) {
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+": "+name);
    }
}
