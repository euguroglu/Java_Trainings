public class Square extends Geometry{
    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of " + getName() + " is: " + (edge * edge));

    }
}
