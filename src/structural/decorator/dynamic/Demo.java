package structural.decorator.dynamic;

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        System.out.println(circle.info());

        ColoredShape blue = new ColoredShape(new Square(10), "Blue");
        System.out.println(blue.info());

        TransparentShape myCircle = new TransparentShape(new ColoredShape(new Circle(5), "Red"), 4);
        System.out.println(myCircle.info());
    }
}
