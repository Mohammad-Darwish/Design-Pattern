package builder.faceted;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder
            .lives()
            .at("123 Budapest road")
            .in("Budapest")
            .withPostcode("10008")
            .works()
            .asA("Dev")
            .at("Eric")
            .earning(52220)
            .build();
        System.out.println(person);
    }
}
