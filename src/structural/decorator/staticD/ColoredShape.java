package structural.decorator.staticD;

import java.util.function.Supplier;

public class ColoredShape<T extends Shape> implements Shape {
    private Shape shape;
    private String color;

    public ColoredShape(Supplier<? extends T> csor,
                        String color) {
        shape = csor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has color " + color;
    }
}
