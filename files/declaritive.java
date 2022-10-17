import java.util.ArrayList;
import java.util.List;

public class declaritive {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Alice", Gender.FEMALE),
            new Person("Bill", Gender.MALE),
            new Person("Maria", Gender.FEMALE)
        );
        //Imperative approach
        System.out.println("//Imperative approach");
        List<Person> females = new ArrayList<Person>();
        for (Person person : people) {
            if ((person.gender).equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female.toString());
        }
        //Declarative approach
        System.out.println("//Declarative approach");
        people.stream()
            .filter(person -> (person.gender).equals(Gender.FEMALE))
            .forEach(System.out::println);
    }
    static class Person {
        private final String name;
        private final Gender gender;
            
        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "Person [name=" + name + ", gender=" + gender + "]";
        }
    }    
    enum Gender {
        MALE, FEMALE
    }
}
