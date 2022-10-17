package packages;

public class packages1 {
    
    public String name;
    public int age;

    public packages1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("Dog: " + name + " age: " + age);
    }
}
