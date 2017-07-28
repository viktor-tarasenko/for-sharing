package classwork;

public class Square implements Shape {
    private int side;
    private Colour colour;

    Square(int side) {
        this.side = side;
    }

    @Override
    public int size() {
        return (int) Math.pow(side, 2);
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