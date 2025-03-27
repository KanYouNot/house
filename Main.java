import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Jan", "Kowalski"),
                new Person("Anna", "Nowak"),
                new Person("Piotr", "Zieliński")
        );


        char[] p1n = people.getFirst().toString().toCharArray();
        char[] p2n = people.getFirst().toString().toCharArray();
        char[] p3n = people.getFirst().toString().toCharArray();
        for (int i = 0; i < people.size(); i++) {
//            char x = people.get(i).toString().toCharArray();
            char[] x = {'A'};
            if (x.equals(people.get(i).toString().toCharArray())){

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
