package ShapeFactory;

public class rectangle implements ShapeFactory{
    @Override
    public void printArea() {
        System.out.println("Area rectangle= "+" length*width");
    }
}
