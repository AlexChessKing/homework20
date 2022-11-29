import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Сергей", "Заболотский", 48));
        people.add(new Person("Константин", "Гасилов", 48));
        people.add(new Person("Николай", "Репин", 47));
        people.add(new Person("Александр", "Яковлев", 46));
        people.add(new Person("Денис", "Дорош", 47));
        people.add(new Person("Александр", "Аристов", 46));
        people.add(new Person("Владимир", "Канашевский", 47));

        System.out.println(people);

        Collections.sort(people, new PersonsComparator());

        System.out.println(people);
    }
}
