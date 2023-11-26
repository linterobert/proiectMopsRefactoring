package OldFiles.ReplaceTempWithQuery;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        double area = Math.PI * circle.radius * circle.radius;

        System.out.println("Area of the circle: " + area);
    }
}
