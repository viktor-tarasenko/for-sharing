package classwork;

public class Circle implements Shape {
    private int diameter;
    private Colour colour;

    Circle(int diameter) {
        this.diameter = diameter;
    }

//    Circle(int diameter, Colour colour) {
//        this.diameter = diameter;
//        this.colour = colour;
//    }

    @Override
    public int size() {
        int radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);
        return (int) area;
    }

    @Override
    public int colour() {
        return size() * colour.cost;
    }

    @Override
    public int compareTo(Shape o) {
        return colour() - o.colour();
    }
}
