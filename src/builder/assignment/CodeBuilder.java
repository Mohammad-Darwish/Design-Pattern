package builder.assignment;

public class CodeBuilder {
    Person person;

    public CodeBuilder(String className) {
        if (className == "Person") {
            person = new Person();
        }
    }

    public CodeBuilder addField(String name, String type) {
        if (type == "String") {
            person.name = name;
        }
        if (type == "int") {
            person.age = Integer.parseInt(name);
        }
        return this;
    }

    @Override
    public String toString() {
        return "Person name: " + person.name + "\nPerson age: " + person.age;
    }
}
