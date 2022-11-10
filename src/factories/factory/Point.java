package factories.factory;

public class Point {

    private double x, y;

    private Point(double a, double b, CoordinateSystem cs) {
        switch (cs) {
            case POLAR:
                this.x = a * Math.cos(b);
                this.y = b * Math.sin(b);
                break;
            case CARTESIAN:
                this.x = a;
                this.y = b;
                break;
        }
    }

    public static class Factory {

        public static Point newCartesianPoint(double x, double y) {
            return new Point(x, y, CoordinateSystem.CARTESIAN);
        }

        public static Point newPolarPoint(double x, double y) {
            return new Point(x, y, CoordinateSystem.POLAR);
        }
    }
}
