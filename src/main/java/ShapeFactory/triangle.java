package ShapeFactory;

public class triangle implements ShapeFactory{
    @Override
    public void printArea() {
        System.out.println("Area triangle   "+"double p = (a+b+c)/2;       \n" +
                "Area= Math.sqrt(p*(p-a)*(p-b)*(p-c));");
    }
}
