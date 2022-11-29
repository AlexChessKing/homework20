import java.util.Comparator;

public class PersonsComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        if (o1.getSurname().length() != o2.getSurname().length()) {
            return Integer.compare(o1.getSurname().length(), o2.getSurname().length());
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
