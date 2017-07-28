package classwork;

public interface Shape extends Comparable<Shape> {

    int size();

    int colour();

    @Override
    int compareTo(Shape o);
}
