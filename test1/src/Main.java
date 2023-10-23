public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape s1 = shapeFactory.createShape("사각형","사각형",10,40);
        Shape s2 = shapeFactory.createShape("삼각형","삼각형",10,40);

    }

}
