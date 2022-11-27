package structural.decorator.staticD;

public class Demo {
    public static void main(String[] args) {
        ColoredShape<Square> squareColoredShape = new ColoredShape<>(() -> new Square(10), "Blue");
        System.out.println(squareColoredShape.info());

        TransparentShape<ColoredShape<Circle>> transparentShape =
            new TransparentShape<>(() -> new ColoredShape<>(() -> new Circle(6), "Red"), 7);
        System.out.println(transparentShape.info());
    }
}
