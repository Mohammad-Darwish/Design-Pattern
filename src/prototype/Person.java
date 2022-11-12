package prototype;

import java.util.Arrays;

public class Person {
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
            "names=" + Arrays.toString(names) +
            ", address=" + address +
            '}';
    }

    /**
     * It is not accepted to use cloneable in deep copying. Deep copying when we copy the object but not copy the reference
     * But shallow copying, we are copying the reference as well.
     */

    @Deprecated
    @Override
    public Person clone() {
        return new Person(names.clone(), address.clone());
    }
}
