package liskov;

public class Demo {

    public static void useIt(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);

        // area = width * 10
        System.out.println(
            "Expected area of " + (width * 10) +
                ", got " + rectangle.getArea());
    }
}
