package comp31.thymeleaf.model;

import java.util.ArrayList;
import java.util.Random;

public class PersonList extends ArrayList<Person> {

    public PersonList(int numberOfPeople) {
        super();
        generateRandomPeople(numberOfPeople);
    }

    private void generateRandomPeople(int numberOfPeople) {
        String[] firstNames = { "John", "Jane", "Alex", "Emily", "Chris", "Katie", "Michael", "Laura", "David",
                "Sophia" };
        String[] lastNames = { "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis",
                "Rodriguez", "Martinez" };
        Random random = new Random();

        for (int i = 0; i < numberOfPeople; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@example.com";
            String phone = generateRandomPhoneNumber(random);
            add(new Person(firstName, lastName, email, phone));
      }

    }

    public static String generateRandomPhoneNumber(Random random) {
        return String.format("%03d-%03d-%04d", random.nextInt(1000), random.nextInt(1000), random.nextInt(10000));
    }

}
