import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jan", "Kowalski"),
                new Person("Anna", "Nowak"),
                new Person("Piotr", "Zieliński")
        );



        System.out.println("Imiona zaczynajace sie na litere A:");
        for (Person person : people) {
            char[] x = person.toString().toCharArray();
            char y = x[0];
            if ('A' == y) {
                System.out.println(person);
            }
        }
        System.out.println();

        System.out.println("Imiona dluzsze niz 4 litery:");
        for (Person person : people) {
            char[] x = person.toString().toCharArray();
            if (person.firstName.length()>4) {
                System.out.println(person);
            }
        }
        System.out.println();



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