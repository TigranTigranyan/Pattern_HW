package ShapeFactory;

public class shFactory {
    public static ShapeFactory createShFactory(String factory)     {

        switch (factory) {
            case "triangle" ->new triangle().printArea();
            case "rectangle" -> new rectangle().printArea();
            case "circle" -> new circle().printArea();
            default -> throw new IllegalArgumentException("Unknown channel " + factory);
        };
        return null ;
    }

}
