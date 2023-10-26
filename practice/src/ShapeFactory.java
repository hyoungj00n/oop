public class ShapeFactory implements ShapeFactoryInterface{

    Shape shape;
    public Shape createShape(String type, int min, int max){
        if (type == "Rectangle"){
            shape = new Rectangle("Rectangle",min,max);
        }
        else if(type == "Triangle"){
            shape = new Triangle("Triangle",min,max);
        }
        return shape;
    }
}
