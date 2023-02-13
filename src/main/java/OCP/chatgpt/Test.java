package OCP.chatgpt;

import OCP.chatgpt.good.Circle;
import OCP.chatgpt.good.Rectangle;
import OCP.chatgpt.good.ShapeCalculator;

public class Test {
    public static void main(String[] args) {
        Circle circleGood = new Circle(3.4);
        ShapeCalculator shapeCalculatorGood = new ShapeCalculator();

        double area = shapeCalculatorGood.calculateArea(circleGood);
        System.out.println(area);

        // Outro exemplo:
        final double area1 = shapeCalculatorGood.calculateArea(new Rectangle(4, 3));
        System.out.println(area1);
    }
}
