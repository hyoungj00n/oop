public class Main {

    public static void main(String[] args) {

        ShapeFactoryInterface shapefactory = new ShapeFactory();

        Shape shape1 = shapefactory.createShape("Rectangle",10,20);
        Shape shape2 = shapefactory.createShape("Triangle",10,20);

        System.out.println(shape1.getShapeName());
    }
}
