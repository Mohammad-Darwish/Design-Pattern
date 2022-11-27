package structural.decorator.staticD;

public class Circle implements Shape {
    private float radius;

    public Circle() {
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public void resize(float factor) {
        radius *= factor;
    }

    @Override
    public String info() {
        return "Circle of radius " + radius;
    }
}
