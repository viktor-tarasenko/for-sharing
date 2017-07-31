package classwork;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.00");

        Shape first = new Square(5, Colour.RED);
        Shape second = new Square(10, Colour.GREEN);
        Shape third = new Circle(6, Colour.BLUE);
        Shape forth = new Circle(6, Colour.RED);

        List<Shape> AllObjects = new ArrayList<>();
        AllObjects.add(first);
        AllObjects.add(second);
        AllObjects.add(third);
        AllObjects.add(forth);

        System.out.println(df.format(calculateCost(AllObjects, Colour.RED)));
        System.out.println(findMostExpensive(AllObjects));
    }

    private static double calculateCost(List<Shape> shapes, Colour filterColour) {
        double sum = 0;
        switch (filterColour) {
            case RED: {
                for (Shape shape : shapes) {
                    if (shape.getColour() == Colour.RED) {
                        sum += shape.colour();
                    }
                }
                return sum;
            }
            case GREEN: {
                for (Shape shape : shapes) {
                    if (shape.getColour() == Colour.GREEN) {
                        sum += shape.colour();
                    }
                }
                return sum;
            }
            case BLUE: {
                for (Shape shape : shapes) {
                    if (shape.getColour() == Colour.BLUE) {
                        sum += shape.colour();
                    }
                }
                return sum;
            }
            default: {
                System.out.println("SIC!");
                return sum;
            }
        }
    }

    private static Shape findMostExpensive(List<Shape> shapes) {
        Shape resultShape = shapes.get(0);
        for (Shape shape : shapes) {
            if (resultShape.compareTo(shape) < 0) {
                resultShape = shape;
            }
        }
        return resultShape;
    }
}