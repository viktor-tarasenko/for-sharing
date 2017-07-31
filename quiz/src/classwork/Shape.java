package classwork;

public interface Shape extends Comparable<Shape> {

    Colour colour = null;

    double size();

    double colour();

    Colour getColour();

    @Override
    int compareTo(Shape o);

    @Override
    String toString();
}
