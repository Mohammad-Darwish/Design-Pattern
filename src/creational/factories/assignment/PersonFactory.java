package creational.factories.assignment;

public class PersonFactory {
    static int id = 0;

    public Person createPerson(String name) {
        Person person = new Person(id, name);
        id++;
        return person;
    }
}
