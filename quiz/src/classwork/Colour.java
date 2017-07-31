package classwork;

public enum Colour {
    RED(100),
    GREEN(150),
    BLUE(200);

    int cost;

    Colour(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString(){
        return this.name();
    }
}