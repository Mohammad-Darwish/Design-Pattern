package builder;

import builder.fluent.builder.with.recursiveGenerics.EmployeeBuilder;
import builder.fluent.builder.with.recursiveGenerics.Person;

public class Main {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Person moh = employeeBuilder
            .withName("Moh")
            .worksAt("Developer")
            .build();

        System.out.println(moh);
    }
}
