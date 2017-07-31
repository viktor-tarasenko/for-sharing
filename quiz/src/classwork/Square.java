package classwork;

public class Square implements Shape {
    public int side;
    public Colour colour;
    public int id = 1;

    Square(int side) {
        this.side = side;
    }

    Square(int side, Colour colour) {
        this.side = side;
        this.colour = colour;
        id++;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    @Override
    public double size() {
        return Math.pow(side, 2);
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
    public String toString(){
        return "Square #" + id + ", " + colour;
    }
}