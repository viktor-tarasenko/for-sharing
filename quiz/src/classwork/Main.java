package classwork;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Shape first = new Square(5);
        Shape second = new Square(10);
        Shape third = new Circle(5);
        Shape forth = new Circle(10);
        List<Shape> AllObjects = new ArrayList<>();
        AllObjects.add(first);
        AllObjects.add(second);
        AllObjects.add(third);
        AllObjects.add(forth);

        System.out.println(calculateCost(AllObjects,Colour.RED));
    }

    private static double calculateCost(List<Shape> shapes, Colour filterColour) {
        double sum = 0;
        switch (filterColour){
            case RED:{
                for (Shape shape : shapes) {
                    sum += shape.colour();
                }
                return sum;
            }
            case BLUE:{
                for (Shape shape : shapes) {
                    sum = shape.colour();
                }
                return sum;
            }
            case GREEN:{
                for (Shape shape : shapes) {
                    sum = shape.colour();
                }
                return sum;
            }
            default:
                System.out.println("Error!");
                return sum;
        }
    }

    private Shape findMostExpensive(List<Shape> shapes) {
        return null;
    }
}