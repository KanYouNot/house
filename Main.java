import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jan", "Kowalski"),
                new Person("Anna", "Nowak"),
                new Person("Piotr", "Zieliński")
        );
        
        for (Person person : people) {
            char[] x = person.toString().toCharArray();
            char y = x[0];
            if ('A' == y) {
                System.out.println(person);
            }
        }



    }

    static class Person {
        String firstName;
        String lastName;

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName;
        }

    }
}