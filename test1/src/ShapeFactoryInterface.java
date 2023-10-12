import java.awt.Shape;

public interface ShapeFactoryInterface extends Shape {
    Shape createShape(String type, int min, int max);
}
