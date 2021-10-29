import java.lang.reflect.Member;

public class Circle extends Geometry{
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of " + getName() + " " + (Math.PI * radius));

    }
}
