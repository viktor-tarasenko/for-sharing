package classwork;

public class Circle implements Shape {
    public int diameter;
    public Colour colour;
    public int id = 1;

    Circle(int diameter) {
        this.diameter = diameter;
    }

    Circle(int diameter, Colour colour) {
        this.diameter = diameter;
        this.colour = colour;
        id++;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    @Override
    public double size() {
        int radius = diameter / 2;
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double colour() {
        return size() * colour.cost;
    }

    @Override
    public int compareTo(Shape o) {
        Shape other = o;
        Shape self = this;
        return (int) self.colour() - (int) other.colour();
    }

    @Override
    public String toString() {
        return "Circle #" + id + ", " + colour;
    }
}
