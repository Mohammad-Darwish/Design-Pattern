package builder;

public class Main {
    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("url");
        builder.addChild("li", "Hello");
        builder.addChild("li", "World");
        System.out.println(builder);
    }
}
