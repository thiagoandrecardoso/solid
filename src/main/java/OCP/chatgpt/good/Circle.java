package OCP.chatgpt.good;

public class Circle implements IShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getAres() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
