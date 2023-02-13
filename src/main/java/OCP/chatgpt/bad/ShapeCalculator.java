package OCP.chatgpt.bad;

public class ShapeCalculator {
    public double calculateArea(Object shape){
        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            return circle.getArea();
        }
        else if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getArea();
        }
        return 0;
    }
}
