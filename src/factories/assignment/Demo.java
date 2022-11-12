package factories.assignment;

public class Demo {
    public static void main(String[] args) {
        Person person1 = new PersonFactory().createPerson("Moh");
        Person person2 = new PersonFactory().createPerson("Sol");
        Person person3 = new PersonFactory().createPerson("Kar");
        System.out.println(person1.getId());
        System.out.println(person2.getId());
        System.out.println(person3.getId());
    }
}
