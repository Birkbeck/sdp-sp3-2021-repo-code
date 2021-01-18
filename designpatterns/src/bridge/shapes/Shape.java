package bridge.shapes;

public abstract class Shape {
    //Composition - implementor
    protected Colour colour;

    //constructor with implementor as input argument
    public Shape(Colour c) {
        this.colour = c;
    }

    abstract public void applyColour();
}