package builder.assignment;

public class Main {
    public static void main(String[] args) {
        CodeBuilder builder = new CodeBuilder("Person");
        builder.addField("Moh", "String").addField("25", "int");
        System.out.println(builder.toString());
    }
}
