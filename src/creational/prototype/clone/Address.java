package creational.prototype.clone;

public class Address implements Cloneable {
    public String streetName;
    public int houseNumber;

    public Address(String streetName, int houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
            "streetName='" + streetName + '\'' +
            ", houseNumber=" + houseNumber +
            '}';
    }

    @Deprecated
    @Override
    public Address clone() {
        return new Address(streetName, houseNumber);
    }
}
