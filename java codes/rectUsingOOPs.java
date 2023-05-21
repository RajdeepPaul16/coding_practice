import java.util.Scanner;

public class rectUsingOOPs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. of students: ");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the id: ");
            int id = s.nextInt();
            System.out.print("Enter the name: ");
            String name = s.next();
            Student h = new Student();
            h.insert(id, name);
            h.display();
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
