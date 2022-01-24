import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Peter", "Patterson", 21));
        personList.add(new Person("Paul", "Walker", 31));
        personList.add(new Person("Steve", "Runner", 17));
        personList.add(new Person("Arnold", "", -1));
        personList.add(new Person(" ", "Stevenson", 19));
        personList.add(new Person("   ", "Stevenson", 19));
        personList.add(new Person("      ", "Stevenson", 19));
        personList.add(new Person(" Arnold", "Stevenson", 19));
        personList.add(null);
        personList.add(new Person("Aaron", "Bortnicker", 18));

        List<String> uniqueNames = personList
                .stream()
                .filter(person -> person != null)
                .filter(person -> person.getAge() > 17)
                .map(person -> person.getFirstName().toUpperCase().trim())
                .filter(person -> person.matches(".*[a-zA-Z].*"))
                .collect(Collectors.toList());
        System.out.println("Unique Names: " + uniqueNames);
    }
}
