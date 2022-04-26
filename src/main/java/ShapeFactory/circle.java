package ShapeFactory;

public class circle implements ShapeFactory{
    @Override
    public void printArea() {
        System.out.println("Area circle= "+" PI* (r*r)");
    }
}
