package creational.prototype.clone;

public class Demo {
    public static void main(String[] args) {
        Person john = new Person(new String[]{"John", "Smith"}, new Address("London Road", 123));
        Person jane = john.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(john);
        System.out.println(jane);
    }
}
